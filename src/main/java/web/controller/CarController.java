package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static web.model.Car.*;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> listCar = new ArrayList<>(getCar(count));
        List<String> messages = new ArrayList<>();
        messages.add("Hello! myCar");
        model.addAttribute("cars", listCar);
        model.addAttribute("messages", messages);
        return "cars";
    }
}
