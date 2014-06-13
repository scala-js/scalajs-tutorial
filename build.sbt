enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

jsDependencies += RuntimeDOM

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher in Compile := true
persistLauncher in Test := false
