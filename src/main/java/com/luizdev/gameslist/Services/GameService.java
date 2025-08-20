package com.luizdev.gameslist.Services;

import com.luizdev.gameslist.dto.GameMinimoDto;
import com.luizdev.gameslist.entities.Game;
import com.luizdev.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinimoDto> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinimoDto(x)).toList();
    }
}
