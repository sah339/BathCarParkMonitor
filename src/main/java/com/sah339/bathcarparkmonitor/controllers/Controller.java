package com.sah339.bathcarparkmonitor.controllers;

import com.sah339.bathcarparkmonitor.repository.model.CarParksDto;
import com.sah339.bathcarparkmonitor.services.CarParkDataService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(Model model) throws IOException {
        CarParksDto allData = CarParkDataService.getCarParkData();
        model.addAttribute("carParksData", allData.data());
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) throws IOException {
        model.addAttribute("name", CarParkDataService.getCarParkData());
        return "greeting";
    }
}
