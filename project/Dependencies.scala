/*
 *
 *   /\\\\\
 *  /\\\///\\\
 * /\\\/  \///\\\    /\\\\\\\\\     /\\\       /\\\
 * /\\\      \//\\\  /\\\/////\\\ /\\\\\\\\\\\ \///    /\\\\\  /\\\\\     /\\\    /\\\  /\\\\\\\\\\
 * \/\\\       \/\\\ \/\\\\\\\\\\ \////\\\////   /\\\  /\\\///\\\\\///\\\ \/\\\   \/\\\ \/\\\//////
 *  \//\\\      /\\\  \/\\\//////     \/\\\      \/\\\ \/\\\ \//\\\  \/\\\ \/\\\   \/\\\ \/\\\\\\\\\\
 *    \///\\\  /\\\    \/\\\           \/\\\_/\\  \/\\\ \/\\\  \/\\\  \/\\\ \/\\\   \/\\\ \////////\\\
 *       \///\\\\\/     \/\\\           \//\\\\\   \/\\\ \/\\\  \/\\\  \/\\\ \//\\\\\\\\\  /\\\\\\\\\\
 *          \/////       \///             \/////    \///  \///   \///   \///  \/////////   \//////////
 *
 * The mathematical programming library for Scala.
 *
 */

import sbt._

object Dependencies {

  object v {
    final val Logback = "1.2.10"
    final val ScalaLogging = "3.9.4"

    final val ScalaTest = "3.2.11"
    final val ScalaCheck = "1.15.4"
    final val ScalaTestPlus = "3.2.11.0"

    final val LpSolve = "5.5.2.0"
    final val ojAlgorithms = "50.0.2"
    final val Trove = "3.1.0"
    final val ScalaXML = "2.0.1"
    final val Enums = "1.7.0"
  }

  // Logging using slf4j and logback
  lazy val Logging: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-classic" % v.Logback,
    "com.typesafe.scala-logging" %% "scala-logging" % v.ScalaLogging
  )

  // ScalaTest and ScalaCheck for UNIT testing
  lazy val ScalaTest: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % v.ScalaTest % "test",
    "org.scalatestplus" %% "scalacheck-1-15" % v.ScalaTestPlus % "test",
    "org.scalacheck" %% "scalacheck" % v.ScalaCheck % "test"
  )

  // GNU Trove collections and other tools
  lazy val Tools: Seq[ModuleID] = Seq(
    "org.scala-lang.modules" %% "scala-xml" % v.ScalaXML,
    "net.sf.trove4j" % "core" % v.Trove,
    "com.beachape" %% "enumeratum" % v.Enums
  )

  // LpSolve library for linear programming
  lazy val LpSolve: ModuleID = "com.datumbox" % "lpsolve" % v.LpSolve

  // oj! Algorithms library for linear and quadratic programming
  lazy val ojAlgorithms: ModuleID = "org.ojalgo" % "ojalgo" % v.ojAlgorithms
}