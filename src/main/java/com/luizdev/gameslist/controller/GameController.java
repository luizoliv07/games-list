package com.luizdev.gameslist.controller;

import com.luizdev.gameslist.Services.GameService;
import com.luizdev.gameslist.dto.GameDto;
import com.luizdev.gameslist.dto.GameMinimoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id) {
        GameDto result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinimoDto> findAll() {
        List<GameMinimoDto> result = gameService.findAll();
        return result;
    }
}
