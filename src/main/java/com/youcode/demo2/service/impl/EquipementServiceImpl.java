package com.youcode.demo2.service.impl;

import com.youcode.demo2.domain.Equipement;
import com.youcode.demo2.repository.EquipementRepository;
import com.youcode.demo2.service.EquipementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component @RequiredArgsConstructor
public class EquipementServiceImpl implements EquipementService {

    private final EquipementRepository equipementRepository;



    @Override
    public Equipement save(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement findByNameAndPlateNumber(String name, UUID plateNumber) {
        return equipementRepository.findByNameAndPlateNumber(name, plateNumber);
    }
}
