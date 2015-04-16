version := "0.1"

organization := "nl.surfsara.twinl"

scalaVersion := "2.10.4"

name := "streaming-twitter-raw"

val sparkVersion  = "1.2.1"

libraryDependencies ++= Seq(
  "org.apache.spark"  %% "spark-core"    % sparkVersion  % "provided",
  "org.apache.spark"  %% "spark-streaming"     % sparkVersion  % "provided",
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "org.twitter4j" % "twitter4j-stream" % "3.0.3"
)
