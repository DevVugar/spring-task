package com.example.springtask.model.dto.requset;

import com.example.springtask.model.entity.Passport;
import lombok.Data;

import java.util.Date;

@Data
public class PassportRequest {
    private Long id;
    private String passportNumber;
    private Date issiuDate;
    private Date expiryDate;
    private String country;
    private TravelerRequest travelerRequest;
}
