package com.example.springtask.model.dto.requset;

import com.example.springtask.model.entity.Tour;
import lombok.Data;

import java.util.Date;

@Data
public class DestinationRequest{
    private Long id;

    private String location;

    private String description;

    private Date visitDate;

    private TourRequest tourRequest;
}
