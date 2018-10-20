package microgorm;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;

public class BootStrap {

    final CarService carService;

    public BootStrap(CarService carService) {
        this.carService = carService;
    }

    @EventListener
    public void onStartup(ServerStartupEvent event) {
        if(carService.count() == 0) {
            carService.save("Ford", "Fusion");
            carService.save("Chevy", "Equinox");
        }
    }
}
