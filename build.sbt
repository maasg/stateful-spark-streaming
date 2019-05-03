import sbt.Keys.libraryDependencies

lazy val root = Project("stateful-spark-streaming", file("."))
.settings(
  scalaVersion:= "2.11.11",
  libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.0",
  libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0",
  libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"
)


