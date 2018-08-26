##### == build.sbt ==

```
name := """infra-core"""
organization := "br.com.infra"
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.6"
```

##### == Publicar ==

```
[infra-core] $ publishLocal
...

[info]  published infra-core_2.12 to /home/usuario/.ivy2/local/br.com.infra/infra-core_2.12/1.0-SNAPSHOT/poms/infra-core_2.12.pom
[info]  published infra-core_2.12 to /home/usuario/.ivy2/local/br.com.infra/infra-core_2.12/1.0-SNAPSHOT/jars/infra-core_2.12.jar
[info]  published infra-core_2.12 to /home/usuario/.ivy2/local/br.com.infra/infra-core_2.12/1.0-SNAPSHOT/srcs/infra-core_2.12-sources.jar
[info]  published infra-core_2.12 to /home/usuario/.ivy2/local/br.com.infra/infra-core_2.12/1.0-SNAPSHOT/docs/infra-core_2.12-javadoc.jar
```

##### == Uso em outros projetos ==

```
libraryDependencies += "br.com.infra" % "infra-core_2.12" % "1.0-SNAPSHOT"
```