package com.luizdev.gameslist.repositories;

import com.luizdev.gameslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
