package com.example.springtask.mapper;

import com.example.springtask.model.dto.requset.CategoryRequestDto;
import com.example.springtask.model.dto.response.CategoryResponseDto;
import com.example.springtask.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    //CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category toEntity(CategoryRequestDto dto);
    CategoryResponseDto toDto(Category category);
}

