# gruesome - A Groovy port of the QuickCheck unit test framework

# HOMEPAGE

http://www.yellosoft.us/quickcheck

# LICENSE

FreeBSD

# VERSION

0.0.1

# REQUIREMENTS

* [Groovy](http://groovy.codehaus.org/) 1.8.3+

## Optional

* [Ruby](https://www.ruby-lang.org/) 1.9+
* [Guard](http://guardgem.org/) 1.8.2+

Use `bundle` to install Guard.

# EXAMPLE

    $ make install
    $ ./example.groovy
    *** Failed!
    [833472555]
    +++ OK, passed 100 tests.
    +++ OK, passed 100 tests.

# DEVELOPMENT

Start Guard in a shell, and it will automatically run unit tests when the source code changes:

    $ guard
        ...
