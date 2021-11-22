package victorchoymetaprogramminginterface

import spock.lang.Specification

class TestInterfaceExtensions extends Specification {
    def "test interface extensions"() {
        setup:
        def obj = new A()

        expect:
        obj.abc() == 'SomeInterfaceExtensionMethods.abc'
    }
}
