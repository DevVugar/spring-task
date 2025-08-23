package com.example.springtask.model.dto.requset;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class TourRequest {

    private String name;
    private String description;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;
    private List<DestinationRequest> destinationRequests;
}
