package com.example.springtask.service.impl;

import com.example.springtask.exception.NotFoundException;
import com.example.springtask.mapper.DestinationMapper;
import com.example.springtask.mapper.GuideMapper;

import com.example.springtask.mapper.TravelerMapper;
import com.example.springtask.model.dto.requset.GuideRequest;
import com.example.springtask.model.dto.response.DestinationResponse;
import com.example.springtask.model.dto.response.GuideResponse;
import com.example.springtask.model.dto.response.TravelerResponse;
import com.example.springtask.model.entity.Guide;
import com.example.springtask.model.entity.Tour;
import com.example.springtask.model.entity.Traveler;
import com.example.springtask.repository.GuideRepository;
import com.example.springtask.repository.TourRepository;
import com.example.springtask.service.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GuideServiceImpl implements GuideService {

    private final GuideRepository guideRepository;
    private final GuideMapper guideMapper;
    private final TourRepository tourRepository;
    private final DestinationMapper destinationMapper;
    private final TravelerMapper travelerMapper;

    @Override
    public GuideResponse add(GuideRequest requestDto) {
        Guide guide = guideMapper.toEntity(requestDto);

        Guide res = guideRepository.save(guide);

        return guideMapper.toResponse(res);
    }

    @Override
    public List<GuideResponse> getAll() {

        return guideRepository.findAll().stream().map((a) -> guideMapper.toResponse(a)).collect(Collectors.toList());
    }

    @Override
    public GuideResponse getById(Long id) {

        Guide guide = guideRepository.findById(id).orElseThrow(() -> new NotFoundException("Guide not found"));


        return guideMapper.toResponse(guide);
    }

    @Override
    public GuideResponse update(GuideRequest guideRequest) {
        Guide guide = guideMapper.toEntity(guideRequest);

        Guide res = guideRepository.save(guide);

        return guideMapper.toResponse(res);
    }

    @Override
    public void setGuideToTour(Long guideId, Long tourId) {
        Guide guide = guideRepository.findById(guideId).orElseThrow(() -> new NotFoundException("Guide not found"));
        Tour tour = tourRepository.findById(tourId).orElseThrow(() -> new NotFoundException("Tour not found"));

        for (int i = 0; i < guide.getTours().toArray().length; i++) {
            if (!tour.getEndDate().equals(guide.getTours().get(i)) && !tour.getStartDate().equals(guide.getTours().get(i).getStartDate())) {
                guide.getTours().add(tour);
            }
        }

    }

    @Override
    public List<DestinationResponse> getDestinationOfTour(Long tourId) {
        Tour tour = tourRepository.findById(tourId).orElseThrow(() -> new NotFoundException("Tour not found"));

        return tour.getDestination().stream().map((d) -> destinationMapper.toResponse(d)).collect(Collectors.toList());
    }

    @Override
    public List<TravelerResponse> getTravelersOfTour(Long tourId) {
        Tour tour = tourRepository.findById(tourId).orElseThrow(() -> new NotFoundException("Tour not found"));

        return tour.getTravelers().stream().map((d) -> travelerMapper.toResponse(d)).collect(Collectors.toList());
    }

}
