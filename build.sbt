enablePlugins(ScalaJSPlugin)

lazy val root = (project in file(".")).aggregate(subproject1, subproject2)

lazy val subproject1 = project.in(file("subproject1")).dependsOn(subproject2)
lazy val subproject2 = project.in(file("subproject2"))
