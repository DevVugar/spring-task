package com.example.springtask.imtahan;

import com.example.springtask.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/population")
@RequiredArgsConstructor
public class PopulationContoller {
    private final PopulationService populationService;


    @GetMapping
    public int getPopulation(@RequestParam String district){
        return populationService.getPopulation(district);
    }

    @GetMapping
    public String getHighPopulation(){
        return populationService.getHighPopulation();
    }
}
