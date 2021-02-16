package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String Car(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}
