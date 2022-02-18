package com.example.VaccinationService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.VaccinationService.Entity.VaccinationCenter;

@Repository
public interface VaccinationRepo extends JpaRepository<VaccinationCenter, Integer>{

}