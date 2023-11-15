package com.youcode.demo2.service;

import com.youcode.demo2.domain.Equipement;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface EquipementService {

    public Equipement save(Equipement equipement);

    public List<Equipement> findAll();

    public Equipement findByNameAndPlateNumber(String name, UUID plateNumber);
}
