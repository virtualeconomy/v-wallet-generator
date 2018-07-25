name := "walletgenerator"

version := "1.0"

scalaVersion := "2.12.0"

libraryDependencies += "org.scorexfoundation" %% "scrypto" % "1.2.0"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.5.0"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.7"

mainClass in assembly := Some("WalletGenerator")
assemblyJarName in assembly := "walletgenerator.jar"
