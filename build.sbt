enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "3.3.3"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.0"
