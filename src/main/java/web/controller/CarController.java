package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiseImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        CarService cars = new CarServiseImpl();
        model.addAttribute("cars", cars.getCar(count));
        return "cars";
    }
}
