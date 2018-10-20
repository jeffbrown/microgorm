package microgorm

import grails.gorm.services.Service
import microgorm.model.Car

@Service(Car)
interface CarService {
    List<Car> list()
    Car save(String make, String model)
    int count()
}
