import sbt._
import Keys._

object ProjectEuler extends Build {

  val defaultSettings = Project.defaultSettings ++ Seq(
    version := "1.0.0-SNAPSHOT"
  )

  lazy val java = Project(
    id = "java",
    base = file("java"),
    settings = defaultSettings ++ Seq(
      name := "project-euler-java"
    )
  )

  lazy val scala = Project(
    id = "scala",
    base = file("scala"),
    settings = defaultSettings ++ Seq(
      name := "project-euler-scala",
      scalaVersion := "2.9.2"
    )
  )
}
