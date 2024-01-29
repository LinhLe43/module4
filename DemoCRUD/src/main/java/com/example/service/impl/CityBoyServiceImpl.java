package com.example.service.impl;

import com.example.model.CityBoy;
import com.example.repository.CityBoyRepository;
import com.example.service.CityBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityBoyServiceImpl implements CityBoyService {
    @Autowired
    private CityBoyRepository cityBoyRepository;
    @Override
    public void save(CityBoy cityBoy) {
        cityBoyRepository.save(cityBoy);
    }

    @Override
    public void delete(Long id) {
        cityBoyRepository.deleteById(id);
    }

    @Override
    public List<CityBoy> findAll() {
        return cityBoyRepository.findAll();
    }

    @Override
    public Optional<CityBoy> findById(Long id) {
        return cityBoyRepository.findById(id);
    }

    @Override
    public List<CityBoy> findByAgeCityBoy(int age) {
        return cityBoyRepository.findByAge(age);
    }

    @Override
    public CityBoy findCustom(String name, int age) {
        return cityBoyRepository.findCustom(name, age);
    }
}
