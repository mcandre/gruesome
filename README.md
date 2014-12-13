# gruesome - A Groovy port of the QuickCheck unit test framework

# EXAMPLE

```
$ mvn install
$ mvn exec:java -Dexec.mainClass=example
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
$ mvn install
```

# LICENSE

FreeBSD

# REQUIREMENTS

* [Groovy](http://groovy.codehaus.org/) 1.8.3+
* [Maven](http://maven.apache.org/) 2+

## Optional

* [Ruby](https://www.ruby-lang.org/) 2+
* [Bundler](http://bundler.io/)
* [Cucumber](http://cukes.info/)
* [Guard](http://guardgem.org/)
* [aspelllint](https://github.com/mcandre/aspelllint)

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
