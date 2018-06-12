package g335.servicedefaultarguments

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def serviceMethod(arg = new Date()) {
        arg
    }

    def serviceMethod2(arg = new Date().clearTime()) {
        arg
    }

    def serviceMethod3(arg = "someString") {
        arg
    }

    def serviceMethod4(arg = "someString".capitalize()) {
        arg
    }
}
