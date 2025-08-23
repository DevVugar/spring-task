package com.example.springtask.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passportNumber;
    private Date issiuDate;
    private Date expiryDate;
    private String country;


    @OneToOne
    @JoinColumn(name = "traveler_id",referencedColumnName = "id")
    private Traveler traveler;
}
