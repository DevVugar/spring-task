package com.example.springtask.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

import lombok.*;
import org.springframework.stereotype.Component;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
}