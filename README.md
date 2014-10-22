jersey-app-archetype
====================

An archetype I use for creating Jersey apps.

Based on:
  Glassfish Application Server
  Freemarker
  Jackson JSON

After cloning the repository, install the archetype into your local Maven repository:

Installation
----
```sh
mvn clean install 
```

Usage
------
```sh
cd /your/app/path
mvn archetype:generate -DarchetypeCatalog=local -DarchetypeGroupId=com.iskernel -DarchetypeArtifactId=web-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.mygroupid -DartifactId=myartifactid -Dpackage=com.mycompany.example
```

Version
----

1.0

License
----

MIT
