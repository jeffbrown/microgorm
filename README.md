# Micro GORM

A trivial example showing that GORM entities in a Micronaut application
may be marked with CompileStatic.

## Running The App

```
./gradlew run
```

## Retrieving Data

```
$ curl http://localhost:8080/cars
[{"make":"Ford","model":"Fusion","id":1},{"make":"Chevy","model":"Equinox","id":2}]
```

## Creating Data

```
$ curl -X POST http://localhost:8080/cars/Dodge/Dart
{"make":"Dodge","model":"Dart","id":3}
```

## Code Of Interest

* src/main/groovy/microgorm/model/Car.groovy
* src/main/groovy/microgorm/CarService.groovy
* src/main/groovy/microgorm/CarController.java
* src/main/groovy/microgorm/BootStrap.java