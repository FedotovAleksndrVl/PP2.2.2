package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static web.model.Car.*;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        //System.out.println(count);

        messages.add("Hello! myCar");
        //web.model.Car.getCar(count);
        messages.add(getCar(count).toString());
        model.addAttribute("messages", messages);
        return "cars";
    }
}
