Spark App with command-line option

Chương trình Spark với tham số dòng lệnh

[Xem bài viết (chưa viết)](https://blog.thaithien.me/)

/zserver/spark/spark-3.0.1-bin-hadoop2.7/README.md


 $SPARK_HOME/bin/spark-submit --class "ArgsSimpleApp" --master local[4]  target/scala-2.12/Args-Simple-Project-assembly-1.0.jar

 Exception in thread "main" org.apache.spark.sql.AnalysisException: Path does not exist: file:/home/cpu11453/workspace/opensource/ApacheSparkArgsSimpleApp/this/is/default/path.txt;
        at org.apache.spark.sql.execution.datasources.DataSource$.$anonfun$checkAndGlobPathIfNecessary$1(DataSource.scala:764)



 $SPARK_HOME/bin/spark-submit \
 --class "ArgsSimpleApp" \
 --master local[4]  \
 target/scala-2.12/Args-Simple-Project-assembly-1.0.jar \
 --logfile $SPARK_HOME/README.md