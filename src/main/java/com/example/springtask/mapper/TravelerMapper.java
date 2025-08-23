package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.TravelerRequest;
import com.example.springtask.model.dto.response.TravelerResponse;
import com.example.springtask.model.entity.Traveler;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TravelerMapper.class})
public interface TravelerMapper {

    Traveler toEntity(TravelerRequest dto);
    TravelerResponse toResponse(Traveler category);
}
