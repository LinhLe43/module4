package com.example.service;

import com.example.model.CityBoy;

import java.util.List;
import java.util.Optional;

public interface CityBoyService {
    void save(CityBoy cityBoy);
    void delete(Long id);
    List<CityBoy> findAll();
    Optional<CityBoy> findById(Long id);
    List<CityBoy> findByAgeCityBoy(int age);
    CityBoy findCustom(String name, int age);
}
