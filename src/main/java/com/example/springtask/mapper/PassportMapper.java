package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.PassportRequest;
import com.example.springtask.model.dto.response.PassportResponse;
import com.example.springtask.model.entity.Passport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TravelerMapper.class})
public interface PassportMapper {

    Passport toEntity(PassportRequest dto);
    PassportResponse toResponse(Passport category);
}
