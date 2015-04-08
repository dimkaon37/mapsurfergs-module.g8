import java.io.File

import play.PlayJava
import play.PlayImport.PlayKeys.playPackageAssets


name := "mapsurferjs-module-$application_name$"

version := "1.0-SNAPSHOT"

organization := "$organization_name$"

val geotoolsVersion = "9.5"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  // Add your project dependencies here,
  javaJdbc,
  cache,
  javaEbean withSources(),
  javaWs,
   "com.gradoservice" %% "geoportal" % "3.6",
  "com.gradoservice" %% "geoportal" % "3.6"  classifier "assets"
)

// Add your own project settings here



resolvers += Resolver.url("Violas Play Modules", url("http://www.joergviola.de/releases/"))(Resolver.ivyStylePatterns)

resolvers += "Open Source Geospatial Foundation Repository" at "http://download.osgeo.org/webdav/geotools/"

resolvers += "Gradoservice Maven repository" at "http://git.prochar.ru/maven/"

resolvers += "Apache Maven repository" at " http://repo1.maven.org/maven2/"

resolvers += Resolver.url("Objectify Play Repository", url("http://deadbolt.ws/releases/"))(Resolver.ivyStylePatterns)


includeFilter in (Assets, LessKeys.less) := "*.less"


Keys.fork in (Test) := false

parallelExecution in Test := false

