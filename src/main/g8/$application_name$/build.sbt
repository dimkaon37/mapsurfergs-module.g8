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
  "javax.media" % "jai_core" % "1.1.3" from "http://download.osgeo.org/webdav/geotools/javax/media/jai_core/1.1.3/jai_core-1.1.3.jar",
  "com.gradoservice" %% "geoportal" % "3.6"
)

// Add your own project settings here


resolvers  += Resolver.url("Violas Play Modules", url("http://www.joergviola.de/releases/"))(Resolver.ivyStylePatterns)


resolvers  += "Apache Maven repository" at " http://repo1.maven.org/maven2/"

resolvers  += "julienrf.github.com" at "http://julienrf.github.com/repo/"

resolvers  += "jasperreports.sourceforge.net/maven2/" at "http://jasperreports.sourceforge.net/maven2/"

resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.url("Objectify Play Repository - snapshots", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns)

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/repo"

resolvers += "Gradoservice Maven repository" at "http://git.prochar.ru/maven/"

resolvers += "Open Source Geospatial Foundation Repository" at "http://download.osgeo.org/webdav/geotools/"

resolvers += "Geosolution Maven repository" at "http://maven.geo-solutions.it/"

resolvers += "Captch" at "http://maven.nfms4redd.org/"

includeFilter in (Assets, LessKeys.less) := "*.less"

packagedArtifacts += ((artifact in playPackageAssets).value -> playPackageAssets.value)

Keys.fork in (Test) := false

parallelExecution in Test := false
