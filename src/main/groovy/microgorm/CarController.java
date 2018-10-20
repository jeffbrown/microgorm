package microgorm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Post;
import microgorm.model.Car;

import java.util.List;

@Controller("/")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @Get("/cars")
    public List<Car> index() {
        return carService.list();
    }

    @Post("/cars/{make}/{model}")
    public Car create(String make, String model) {
        return carService.save(make, model);
    }
}