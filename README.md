presto-udf-put_to_kinesis
==============================

A Presto UDF Plugin to put records into Kinesis streams.

# Usage

```
SELECT put_to_kinesis('stream_name', col)
  FROM ...
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

The below command creates dependency jars as a archive `pkg/presto-udf-put_to_kinesis-X.Y.Z.tgz`, so you can extract and put them into `/usr/lib/presto/plugin` on your Presto servers.

```
./gradlew pkg
```

# Run tests

```
./gradlew test
```

