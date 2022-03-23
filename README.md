# Quarkus - Pretty Time
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-2-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->
_Social Style Date and Time Formatting for Java_

[![Version](https://img.shields.io/maven-central/v/io.quarkiverse.prettytime/quarkus-prettytime?logo=apache-maven&style=for-the-badge)](https://search.maven.org/artifact/io.quarkiverse.prettytime/quarkus-prettytime)
[![Total alerts](https://img.shields.io/lgtm/alerts/g/quarkiverse/quarkus-prettytime.svg?logo=lgtm&logoWidth=18&style=for-the-badge)](https://lgtm.com/projects/g/quarkiverse/quarkus-prettytime/alerts/)
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/quarkiverse/quarkus-prettytime.svg?logo=lgtm&logoWidth=18&style=for-the-badge)](https://lgtm.com/projects/g/quarkiverse/quarkus-prettytime/context:java)

PrettyTime is an OpenSource time formatting library. Completely customizable, it creates human readable, relative timestamps. 
This extension allows you to use this library in Quarkus native applications.

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

**Important**: Be aware that any changes to the injected `PrettyTime` object (as in calling `setLocale` or `setReference`) will reflect on the singleton and its usage in your entire application. In cases where you need to format to a specific locale we recommend you to create a new `PrettyTime` object instead.

The singleton may be referenced by the name `prettyTime` when used in a non-typesafe environment such as templates. For example, if used together with the [Qute](https://quarkus.io/guides/qute-reference) templating engine:

```html
<table>
  {#for label in labels}
  <tr>
    <td>{label.name}</td>
    <td>Created {inject:prettyTime.format(label.created)}</td>
  </tr>
  {/for}
</table>
```

### Native Support

This extension is fully supported in native mode.

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="http://gastaldi.wordpress.com"><img src="https://avatars.githubusercontent.com/u/54133?v=4?s=100" width="100px;" alt=""/><br /><sub><b>George Gastaldi</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-prettytime/commits?author=gastaldi" title="Code">💻</a> <a href="#maintenance-gastaldi" title="Maintenance">🚧</a></td>
    <td align="center"><a href="https://github.com/mkouba"><img src="https://avatars.githubusercontent.com/u/913004?v=4?s=100" width="100px;" alt=""/><br /><sub><b>Martin Kouba</b></sub></a><br /><a href="https://github.com/quarkiverse/quarkus-prettytime/commits?author=mkouba" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
