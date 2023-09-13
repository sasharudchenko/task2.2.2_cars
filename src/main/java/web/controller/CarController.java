package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarServiceImpl carService;

    @Override
    public String toString() {
        return "CarController{" +
                "carService=" + carService +
                '}';
    }

    @GetMapping()
    public String allCars(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        if (count > 5) {
            count = 5;
        }
        model.addAttribute("cars", carService.numbersOfCar(count));
        //System.out.println(carService.numbersOfCar(count));
        return "cars";

    }
}
