# spark-demo

Spark demonstration

## How to run a demo application

```
sbt assembly
docker-compose up -d
docker-compose exec master /opt/spark-2.4.4-bin-hadoop2.7/bin/spark-submit --master spark://master:7077 --class sparkdemo.Main /work/spark-demo/target/scala-2.11/spark-demo-assembly-1.0.jar
```
