package com.luizdev.gameslist.controller;

import com.luizdev.gameslist.Services.GameListService;
import com.luizdev.gameslist.Services.GameService;
import com.luizdev.gameslist.dto.GameListDto;
import com.luizdev.gameslist.dto.GameMinimoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinimoDto> findByList(@PathVariable Long listId) {
        List<GameMinimoDto> result = gameService.findByList(listId);
        return result;
    }
}
