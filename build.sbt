name := """akkademy-db"""

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  "com.typesafe.akka" %% "akka-testkit"   % "2.3.9" % "test",
  "com.google.guava"  % "guava"           % "19.0",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test",
  "org.projectlombok" % "lombok"          % "1.16.18" % "provided"
)


