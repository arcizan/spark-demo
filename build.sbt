name := "spark-demo"
version := "1.0"
scalaVersion := "2.11.12"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.4" % "provided"
)
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
