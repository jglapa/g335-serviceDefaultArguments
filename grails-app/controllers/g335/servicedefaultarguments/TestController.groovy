package g335.servicedefaultarguments

class TestController {

    def testService

    def m1() { render testService.serviceMethod() }

    def m2() { render testService.serviceMethod2() }

    def m3() { render testService.serviceMethod3() }

    def m4() { render testService.serviceMethod3() }
}
