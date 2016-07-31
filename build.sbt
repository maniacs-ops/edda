
val aws        = "1.10.60"
val jackson    = "1.9.2"
val jersey     = "1.11"
val log4j      = "1.2.12"
val slf4j      = "1.6.1"

lazy val edda = project.in(file("."))
  .configure(BuildSettings.profile)
  .enablePlugins(JettyPlugin)
  .settings(libraryDependencies ++= Seq(
    "com.amazonaws"                  % "aws-java-sdk"        % aws,
    "com.netflix.archaius"           % "archaius-core"       % "0.5.6",
    "commons-beanutils"              % "commons-beanutils"   % "1.8.2",
    "commons-collections"            % "commons-collections" % "3.2.1",
    "commons-io"                     % "commons-io"          % "2.4",
    "com.googlecode.java-diff-utils" % "diffutils"           % "1.2.1",
    "org.elasticsearch"              % "elasticsearch"       % "0.90.3",
    "org.apache.httpcomponents"      % "httpclient"          % "4.1",
    "org.codehaus.jackson"           % "jackson-core-asl"    % jackson,
    "org.codehaus.jackson"           % "jackson-mapper-asl"  % jackson,
    "com.sun.jersey"                 % "jersey-core"         % jersey,
    "com.sun.jersey"                 % "jersey-server"       % jersey,
    "com.sun.jersey"                 % "jersey-servlet"      % jersey,
    "org.joda"                       % "joda-convert"        % "1.2",
    "joda-time"                      % "joda-time"           % "2.0",
    "javax.ws.rs"                    % "jsr311-api"          % "1.1.1",
    "org.mongodb"                    % "mongo-java-driver"   % "2.6.5",
    "org.scala-lang"                 % "scala-actors"        % scalaVersion.value,
    "com.netflix.servo"              % "servo-core"          % "0.4.10",
    "org.slf4j"                      % "slf4j-api"           % slf4j,
    "com.spatial4j"                  % "spatial4j"           % "0.3",

    "javax.servlet"                  % "servlet-api"         % "2.5"   % "provided",

    "log4j"                          % "log4j"               % log4j   % "test",
    "org.mockito"                    % "mockito-core"        % "1.8.5" % "test",
    "org.testng"                     % "testng"              % "6.1.1" % "test",
    "org.scalatest"                 %% "scalatest"           % "1.9.1" % "test",
    "org.slf4j"                      % "slf4j-log4j12"       % slf4j   % "test"
  ))
