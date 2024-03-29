name := """PlayAkka"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
