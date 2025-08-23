package com.example.springtask.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import lombok.*;
import org.springframework.stereotype.Component;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;


    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<Destination> destination;

    @ManyToMany
    @JoinTable(name = "tours_travellers",
            joinColumns = @JoinColumn(name = "travellers_id"),
            inverseJoinColumns = @JoinColumn(name = "tour_id"))
    private List<Traveler> travelers;

}