package com.example.springtask.service;


import com.example.springtask.model.dto.requset.GuideRequest;
import com.example.springtask.model.dto.response.DestinationResponse;
import com.example.springtask.model.dto.response.GuideResponse;
import com.example.springtask.model.dto.response.TravelerResponse;
import com.example.springtask.model.entity.Traveler;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface GuideService {
    GuideResponse add(GuideRequest requestDto);

   List<GuideResponse> getAll();

    GuideResponse getById(Long id);

    GuideResponse update(GuideRequest guideRequest);

    void setGuideToTour(Long guideId, Long tourId);

    List<DestinationResponse> getDestinationOfTour(Long tourId);
    List<TravelerResponse> getTravelersOfTour(Long tourId);
}
