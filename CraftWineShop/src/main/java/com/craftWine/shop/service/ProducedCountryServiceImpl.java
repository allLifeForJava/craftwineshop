package com.craftWine.shop.service;

import com.craftWine.shop.models.ProducedCountry;
import com.craftWine.shop.repositories.ProducedCountryRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Service
public class ProducedCountryServiceImpl implements ProducedCountryService {

    private final ProducedCountryRepository producedCountryRepository;

    @Override
    public void save(ProducedCountry producedCountry) {
        producedCountryRepository.save(producedCountry);
    }

    @Override
    public List<ProducedCountry> findAll() {
        return producedCountryRepository.findAll();
    }
}
