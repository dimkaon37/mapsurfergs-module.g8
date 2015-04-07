// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += new MavenRepository("Gradoservice Maven Repository", "http://git.prochar.ru/maven/")

// The Typesafe SNAPSHOT repository
resolvers += Resolver.url("Typesafe Ivy Snapshots Repository", url("http://repo.typesafe.com/typesafe/ivy-snapshots/"))(Resolver.ivyStylePatterns)

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.1-20140718-006752e")

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.3.3")

addSbtPlugin("com.jmparsons.sbt" % "sbt-dustjs-linkedin" % "1.0.3")

addSbtPlugin("com.gradoservice" % "play-plugins-jsapplication" % "1.0")

addSbtPlugin("com.github.germanosin.sbt" % "sbt-jsapplication" % "1.0.0")
