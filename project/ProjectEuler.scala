import sbt._
import Keys._

object ProjectEuler extends Build {

  val defaultSettings = Project.defaultSettings ++ Seq(
    version := "1.0.0-SNAPSHOT"
  )

  lazy val root = Project(
    id = "project-euler",
    base = file("."),
    settings = defaultSettings
  ) aggregate(java, scala)

  lazy val java = Project(
    id = "java",
    base = file("java"),
    settings = defaultSettings
  )

  lazy val scala = Project(
    id = "scala",
    base = file("scala"),
    settings = defaultSettings
  )
}
