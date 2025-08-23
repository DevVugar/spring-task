package com.example.springtask.model.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class PassportResponse {
    private Long id;
    private String passportNumber;
    private Date issiuDate;
    private Date expiryDate;
    private String country;
}
