presto-udf-skeleton
==============================

A skeleton to create A Presto UDF Plugin.

# Usage

```
TBD...
```

# Configurations

TBD...

# Development

# Build

The below command creates dependency jars into `classpath`.

```
./gradlew classpath
```

# Package for Presto

The below command creates dependency jars as a archive `pkg/presto-udf-skeleton-X.Y.Z.tgz`, so you can extract and put them into `/usr/lib/presto/plugin` on your Presto servers.

```
./gradlew pkg
```

# Run tests

```
./gradlew test
```

