package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

import io.micrometer.core.instrument.Meter.Id;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
