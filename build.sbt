scalaJSSettings

name := "Scala.js Tutorial"

scalaVersion := "2.11.2"

libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-jquery" % "0.6"

skip in ScalaJSKeys.packageJSDependencies := false
