package com.luizdev.gameslist.controller;

import com.luizdev.gameslist.Services.GameListService;
import com.luizdev.gameslist.Services.GameService;
import com.luizdev.gameslist.dto.GameListDto;
import com.luizdev.gameslist.dto.GameMinimoDto;
import com.luizdev.gameslist.dto.ReplecementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplecementDto body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
