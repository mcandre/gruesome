# gruesome - a Groovy port of the QuickCheck unit test framework

# EXAMPLE

```
$ gradle install
$ java -cp build/libs/gruesome-all.jar example
*** Failed!
[-474246107]
+++ OK, passed 100 tests.
+++ OK, passed 100 tests.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

See [example.groovy](https://github.com/mcandre/gruesome/blob/master/src/main/groovy/example.groovy) for more information.

# HOMEPAGE

http://www.yellosoft.us/quickcheck

# INSTALL

```
$ gradle install
```

# LICENSE

FreeBSD

# REQUIREMENTS

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.11+
* [Gradle](http://gradle.org/) 6+

## Optional

* [Sonar](http://www.sonarqube.org/)
* [Ruby](https://www.ruby-lang.org/) 2+
* [Bundler](http://bundler.io/)
* [Cucumber](http://cukes.info/)
* [Guard](http://guardgem.org/)
* [aspelllint](https://github.com/mcandre/aspelllint)

E.g., `brew install gradle sonar sonar-runner && bundle`

# DEVELOPMENT

## Testing

Ensure the example script works as expected:

```
$ bundle
$ cucumber
Feature: Run example tests

  Scenario: Running example tests            # features/run_example_tests.feature:3
    Given the program has finished           # features/step_definitions/steps.rb:1
    Then the output is correct for each test # features/step_definitions/steps.rb:5

1 scenario (1 passed)
2 steps (2 passed)
0m1.167s
```

## Local CI

Guard can automatically run testing when the code changes:

```
$ bundle
$ guard -G Guardfile-cucumber
...
```
