package com.luizdev.gameslist.repositories;

import com.luizdev.gameslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {



}
