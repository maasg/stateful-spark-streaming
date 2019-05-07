import sbt.Keys.libraryDependencies

val SparkVersion = "2.4.0"

lazy val root = Project("stateful-spark-streaming", file("."))
.settings(
  scalaVersion:= "2.11.11",
  libraryDependencies += "org.apache.spark" %% "spark-streaming" % SparkVersion,
  libraryDependencies += "org.apache.spark" %% "spark-core" % SparkVersion,
  libraryDependencies += "org.apache.spark" %% "spark-sql" % SparkVersion,
  libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % SparkVersion
)


