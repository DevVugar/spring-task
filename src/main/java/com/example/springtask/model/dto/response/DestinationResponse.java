package com.example.springtask.model.dto.response;

import lombok.Data;

import java.util.Date;

@Data
public class DestinationResponse {

    private Long id;

    private String location;

    private String description;

    private Date visitDate;
}
