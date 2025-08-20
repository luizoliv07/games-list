package com.luizdev.gameslist.controller;

import com.luizdev.gameslist.Services.GameService;
import com.luizdev.gameslist.dto.GameMinimoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinimoDto> findAll() {
        List<GameMinimoDto> result = gameService.findAll();
        return result;
    }
}
