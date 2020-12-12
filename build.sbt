name := """infra-core"""
organization := "br.com.infra"
version := "1.4"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .disablePlugins(PlayLogback)

scalaVersion := "2.13.1"

// Apache Commons
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.11"
libraryDependencies += "org.apache.commons" % "commons-collections4" % "4.4"

// JasperReports
libraryDependencies += "net.sf.jasperreports" % "jasperreports" % "6.16.0"
libraryDependencies += "net.sf.jasperreports" % "jasperreports-fonts" % "6.16.0"
libraryDependencies += "net.sf.jasperreports" % "jasperreports-functions" % "6.16.0"
libraryDependencies += "net.sf.jasperreports" % "jasperreports-metadata" % "6.16.0"
libraryDependencies += "com.lowagie" % "itext" % "2.1.7"

// Vavr: https://www.vavr.io/
libraryDependencies += "io.vavr" % "vavr" % "0.10.3"

// Caelum
libraryDependencies += "br.com.caelum.stella" % "caelum-stella-core" % "2.1.4"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

// Resolve only newly added dependencies
updateOptions := updateOptions.value.withCachedResolution(true)

assemblyJarName in assembly := "infra-core-1.3.jar"
assemblyMergeStrategy in assembly := {
  case PathList("play", "reference-overrides.conf", xs @ _*) => MergeStrategy.last
  case PathList("module-info.class", xs @ _*) => MergeStrategy.last
  case PathList("org", "apache", xs @ _*) => MergeStrategy.last
  case PathList("jasperreports_extension.properties", xs @ _*) => MergeStrategy.concat
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}