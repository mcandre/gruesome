# gruesome - A Groovy port of the QuickCheck unit test framework

# HOMEPAGE

http://www.yellosoft.us/quickcheck

# INSTALL

    $ make install

# EXAMPLE

    $ make install
    $ groovy example.groovy
    *** Failed!
    [833472555]
    +++ OK, passed 100 tests.
    +++ OK, passed 100 tests.

# LICENSE

FreeBSD

# REQUIREMENTS

* [Groovy](http://groovy.codehaus.org/) 1.8.3+

## Optional

* [Ruby](https://www.ruby-lang.org/) 2+
* [Bundler](http://bundler.io/)
* [Cucumber](http://cukes.info/)
* [Guard](http://guardgem.org/)
* [aspelllint](https://github.com/mcandre/aspelllint)

# DEVELOPMENT

## Testing

Ensure the example script works as expected:

    $ bundle
    $ cucumber
    Feature: Run example tests

      Scenario: Running example tests            # features/run_example_tests.feature:3
        Given the program has finished           # features/step_definitions/steps.rb:1
        Then the output is correct for each test # features/step_definitions/steps.rb:5

    1 scenario (1 passed)
    2 steps (2 passed)
    0m1.167s

## Local CI

Guard can automatically run testing when the code changes:

    $ bundle
    $ guard -G Guardfile-cucumber
    ...
