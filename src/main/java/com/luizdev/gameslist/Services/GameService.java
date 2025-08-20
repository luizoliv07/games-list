package com.luizdev.gameslist.Services;

import com.luizdev.gameslist.dto.GameDto;
import com.luizdev.gameslist.dto.GameMinimoDto;
import com.luizdev.gameslist.entities.Game;
import com.luizdev.gameslist.exceptions.ResourceNotFoundException;
import com.luizdev.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public GameDto findById(Long id) {
        Game result = gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Jogo não encontrado com ID: " + id));
        return new GameDto(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinimoDto> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinimoDto(x)).toList();
    }
}
