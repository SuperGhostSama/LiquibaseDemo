package com.youcode.demo2.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Equipement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name mus")
    @NotBlank
    @Pattern(regexp = "")
    private String name;

    private Double price;

    private UUID plateNumber;

}
