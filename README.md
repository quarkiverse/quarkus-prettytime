# Quarkus - Pretty Time
_Social Style Date and Time Formatting for Java_

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.prettytime/quarkus-prettytime?logo=apache-maven&style=for-the-badge)](https://search.maven.org/artifact/io.quarkiverse.prettytime/quarkus-prettytime)

PrettyTime is an OpenSource time formatting library. Completely customizable, it creates human readable, relative timestamps. 
This extension allows you to use this library in Quarkus and compile to native.

You can find more about it at https://www.ocpsoft.org/prettytime/.

To get started, add the dependency:

```xml
<dependency>
    <groupId>io.quarkiverse.prettytime</groupId>
    <artifactId>quarkus-prettytime</artifactId>
    <version>LATEST</version>
</dependency>
```

## Features

### Inject PrettyTime Singleton

A singleton `org.ocpsoft.prettytime.PrettyTime` can be injected anywhere. 

```java
// Inject PrettyTime using the default locale
@Inject PrettyTime prettyTime;
```

### Native Support

This extension is fully supported in native mode.
