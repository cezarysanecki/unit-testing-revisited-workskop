package pl.unittestingrevisitedworkshop

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class UnitTestingRevisitedWorkshopApplicationTests extends Specification {

    def "load context"() {
        expect:
        true
    }

}
