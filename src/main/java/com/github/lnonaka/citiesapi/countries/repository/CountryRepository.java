package com.github.lnonaka.citiesapi.countries.repository;

import com.github.lnonaka.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
