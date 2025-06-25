package com.example.springtask.imtahan;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Service
public class PopulationService {
        Map<String, Integer> districtPopulation;

    public int getPopulation(@RequestParam String district) {
        districtPopulation  = new HashMap<>();
        districtPopulation.put("Nizami", 215000);
        districtPopulation.put("Narimanov", 180000);
        districtPopulation.put("Yasamal", 300000);
        districtPopulation.put("Binagadi", 270000);
        districtPopulation.put("Sabail", 160000);
        districtPopulation.put("Khatai", 250000);
        districtPopulation.put("Surakhani", 230000);


        return districtPopulation.get(district);
    }

    public String getHighPopulation() {
        districtPopulation  = new HashMap<>();
        districtPopulation.put("Nizami", 215000);
        districtPopulation.put("Narimanov", 180000);
        districtPopulation.put("Yasamal", 300000);
        districtPopulation.put("Binagadi", 270000);
        districtPopulation.put("Sabail", 160000);
        districtPopulation.put("Khatai", 250000);
        districtPopulation.put("Surakhani", 230000);



        return null;
    }
}
