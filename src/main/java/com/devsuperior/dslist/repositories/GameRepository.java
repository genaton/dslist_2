package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

import io.micrometer.core.instrument.Meter.Id;

public interface GameRepository extends JpaRepository<Game, Long> {

}
