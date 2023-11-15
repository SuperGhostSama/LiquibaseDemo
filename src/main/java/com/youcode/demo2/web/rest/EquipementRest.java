package com.youcode.demo2.web.rest;

import com.youcode.demo2.domain.Equipement;
import com.youcode.demo2.service.EquipementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/equipements")
public class EquipementRest {

    private final EquipementService equipementService;



    @PostMapping("/save")
    public Equipement save(@RequestBody Equipement equipement) {

        Equipement equipement1 = Equipement
                .builder()
                .price(Double.valueOf(10.))
                .plateNumber(UUID.randomUUID())
                .build();
        return equipementService.save(equipement);
    }
    @GetMapping("/")
    public List<Equipement> findAll() {
        return equipementService.findAll();
    }

    @GetMapping("/find/{test}/{test2}")
    public Equipement findByNameAndPlateNumber(@PathVariable("test2") String name,@PathVariable("test") UUID plateNumber) {
        return equipementService.findByNameAndPlateNumber(name, plateNumber);
    }
}
