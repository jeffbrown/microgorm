package microgorm.model

import grails.gorm.annotation.Entity
import groovy.transform.CompileStatic

@Entity
@CompileStatic
class Car {
    String make
    String model
}
