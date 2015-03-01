enablePlugins(ScalaJSPlugin)

name := "subproject1"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

persistLauncher in Compile := true

persistLauncher in Test := false

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)
