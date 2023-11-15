package com.youcode.demo2.repository;

import com.youcode.demo2.domain.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement, Long> {

    public Equipement findByNameAndPlateNumber(String name, UUID number);

}
