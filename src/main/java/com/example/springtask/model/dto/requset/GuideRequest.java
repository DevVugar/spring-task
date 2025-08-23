package com.example.springtask.model.dto.requset;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GuideRequest {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

}
