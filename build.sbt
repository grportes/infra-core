name := """infra-core"""

organization := "br.com.infra"

version := "1.1-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .disablePlugins(PlayLogback)

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

// Resolve only newly added dependencies
updateOptions := updateOptions.value.withCachedResolution(true)

/*

publishTo := Some("infra" at "http://localhost:8082/repository/infra/" )

credentials += Credentials(
  "infra",
  "http://localhost:8082/repository/infra/",
  "admin",
  "31bab4fb"
)

*/
