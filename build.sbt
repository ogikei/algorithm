lazy val commonSettings = Seq(
  version := "0.1",
  scalaVersion := "2.11.12",
  libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12" % "test",
    "org.scalatest" % "scalatest_2.11" % "3.0.5" % "test",
    "org.mockito" % "mockito-core" % "2.16.0" % "test"
  )
)

lazy val algorithm = (project in file("."))
    .settings(
      commonSettings,
      name := "algorithm"
    )
