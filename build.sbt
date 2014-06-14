scalaJSSettings

name := "Scala.js Tutorial"

scalaVersion := "2.11.2"

libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-jquery" % "0.6"

ScalaJSKeys.jsDependencies += scala.scalajs.sbtplugin.RuntimeDOM

skip in ScalaJSKeys.packageJSDependencies := false

// uTest settings
utest.jsrunner.Plugin.utestJsSettings

ScalaJSKeys.persistLauncher in Compile := true

ScalaJSKeys.persistLauncher in Test := false
