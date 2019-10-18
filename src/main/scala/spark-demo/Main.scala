package sparkdemo

import org.apache.spark.{SparkConf,SparkContext}

object Main extends App {
  SparkDemo.run
}

object SparkDemo {
  def run: Unit = {
    val conf = new SparkConf().setAppName("spark-demo")
    val sc = new SparkContext(conf)
    val rdd = sc.range(0, 100, 1, 10)

    println("-------- Start --------")
    println(rdd.map(_ * 2).sum)
    println("-------- End --------")
  }
}
