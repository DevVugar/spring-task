package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.GuideRequest;
import com.example.springtask.model.dto.response.GuideResponse;
import com.example.springtask.model.entity.Guide;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GuideMapper {

    Guide toEntity(GuideRequest dto);
    GuideResponse toResponse(Guide category);

    List<GuideResponse> toList(List<Guide> category);
}

