package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.TourRequest;
import com.example.springtask.model.dto.response.TourResponse;
import com.example.springtask.model.entity.Tour;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DestinationMapper.class})
public interface TourMapper {

    Tour toEntity(TourRequest dto);
    TourResponse toResponse(Tour category);
}
