package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIpm;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceIpm carServiceIpm;

@Autowired
    public CarsController(CarServiceIpm carServiceIpm) {
        this.carServiceIpm = carServiceIpm;
    }
@GetMapping()
    public String cars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {

    if (count != 0) {
        model.addAttribute("cars", carServiceIpm.showCars(count));
    } else {
        model.addAttribute("cars",carServiceIpm.carsList());
    }

    return "all-cars";
    }



}