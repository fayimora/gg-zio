ThisBuild / scalaVersion     := "3.1.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.fayimora"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "gg-zio",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0-RC6",
      "dev.zio" %% "zio-config" % "3.0.0-RC9",
      "dev.zio" %% "zio-config-typesafe" % "3.0.0-RC9",
      "dev.zio" %% "zio-config-magnolia" % "3.0.0-RC9",
//      "dev.zio" %% "zio-test" % "2.0.0-RC6" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
