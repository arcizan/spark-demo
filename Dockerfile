FROM amazonlinux:2

RUN yum upgrade -y
RUN yum install -y gzip tar wget

ENV JAVA_VERSION=1.8.0
RUN amazon-linux-extras enable corretto8 && yum install -y java-${JAVA_VERSION}-amazon-corretto-devel

ENV SPARK_VERSION=2.4.4
ENV HADOOP_VERSION=2.7
RUN wget -q http://ftp.jaist.ac.jp/pub/apache/spark/spark-${SPARK_VERSION}/spark-${SPARK_VERSION}-bin-hadoop${HADOOP_VERSION}.tgz -O- | tar -C /opt -zxf -
