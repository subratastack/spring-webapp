package com.subrata_education.spring_webapp.mvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;
    private Integer version;

    @NotNull
    @NotBlank
    @Size(max=50)
    @Column(length = 50)
    private String beerName;
    private BeerStyle beerStyle;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}