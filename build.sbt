val scala3Version = "3.5.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Learn Scala 3",
    version := s"$scala3Version-final",
    scalaVersion := scala3Version,
    maxErrors := 10,
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-simple" % "1.7.36",
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "com.typesafe.akka" %% "akka-actor-typed" % "2.6.19",
      "com.typesafe.akka" %% "akka-actor" % "2.6.19",
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-unchecked",
    ),   
    fork := true,
  )
