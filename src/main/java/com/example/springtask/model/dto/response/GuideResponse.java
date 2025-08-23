package com.example.springtask.model.dto.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GuideResponse {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

}
