Spark App with command-line option

Chương trình Spark với tham số dòng lệnh

[Xem bài viết](https://blog.thaithien.me/index.php/2021/03/07/tham-so-dong-lenh-cho-apache-spark-voi-scopt/)

/zserver/spark/spark-3.0.1-bin-hadoop2.7/README.md

 $SPARK_HOME/bin/spark-submit \
 --class "ArgsSimpleApp" \
 --master local[4]  \
 target/scala-2.12/Args-Simple-Project-assembly-1.0.jar \
 --logfile $SPARK_HOME/README.md