/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession
import scopt.OptionParser

/**
* set available args and default value
*/
case class Config(
    logfile: String = "this/is/default/path.txt",
    )

/*
* 
*/
object ArgsSimpleApp {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    // define parser
    val parser = new scopt.OptionParser[Config]("scopt") {
      head("scopt", "4.x")
      opt[String]('f', "logfile")
        .action((x, c) => c.copy(logfile = x))
        .text("input logFile")
    }

    // parser.parse returns Option[C]
    parser.parse(args, Config()) match {
      case Some(config) =>
        // do stuff
        val logFile = config.logfile
        println(s"logfile $logFile")
        val logData = spark.read.textFile(logFile).cache()
        val numAs = logData.filter(line => line.contains("a")).count()
        val numBs = logData.filter(line => line.contains("b")).count()
        println(s"log file dir is $logFile")
        println(s"Lines with a: $numAs, Lines with b: $numBs")
        
      case None =>
        // arguments are bad, error message will have been displayed
        println("nope nope nope")

    }
    spark.stop()
  }
}