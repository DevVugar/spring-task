package com.example.springtask.model.dto.requset;

import lombok.Data;

@Data
public class TravelerRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private PassportRequest passportRequest;
}
