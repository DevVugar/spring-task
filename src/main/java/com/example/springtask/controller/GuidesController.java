package com.example.springtask.controller;

import com.example.springtask.model.dto.requset.GuideRequest;
import com.example.springtask.model.dto.response.DestinationResponse;
import com.example.springtask.model.dto.response.GuideResponse;
import com.example.springtask.model.dto.response.TourResponse;
import com.example.springtask.model.dto.response.TravelerResponse;
import com.example.springtask.model.entity.Traveler;
import com.example.springtask.service.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/category")
@RequiredArgsConstructor
public class GuidesController {

    private final GuideService guideService;


    @PostMapping("/add")
    public GuideResponse add(@RequestBody GuideRequest guideRequest) {
        return guideService.add(guideRequest);
    }

    @GetMapping("/get/{id}")
    public GuideResponse getById(@PathVariable Long id) {
        return guideService.getById(id);
    }

    @PutMapping("/update")
    public GuideResponse update(@RequestBody GuideRequest guideRequest) {
        return guideService.update(guideRequest);
    }

    @GetMapping("/getAll")
    public List<GuideResponse> getAll() {
        return guideService.getAll();
    }

    @PostMapping("/setGuideToTour")
    public void setGuideToTour(Long guideId, Long tourId){
         guideService.setGuideToTour(guideId,tourId);
    }

    @GetMapping("/getDestinationOfTour")
    public List<DestinationResponse> getDestinationOfTour(Long tourId){
       return guideService.getDestinationOfTour(tourId);
    }

    @GetMapping("/getTravelersOfTour")
    public List<TravelerResponse> getTravelersOfTour(Long tourId){
        return guideService.getTravelersOfTour(tourId);
    }

}