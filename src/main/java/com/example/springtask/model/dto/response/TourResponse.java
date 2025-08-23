package com.example.springtask.model.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TourResponse {

    private String name;
    private String description;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;
}
