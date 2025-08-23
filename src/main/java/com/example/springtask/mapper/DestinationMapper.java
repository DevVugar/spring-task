package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.DestinationRequest;
import com.example.springtask.model.dto.response.DestinationResponse;
import com.example.springtask.model.entity.Destination;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TravelerMapper.class})
public interface DestinationMapper {

    Destination toEntity(DestinationRequest dto);
    DestinationResponse toResponse(Destination category);
}

