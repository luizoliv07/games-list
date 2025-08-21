package com.luizdev.gameslist.dto;


import com.luizdev.gameslist.entities.Game;
import com.luizdev.gameslist.projections.GameMinimoProjection;

public class GameMinimoDto {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinimoDto() {
    }

    public GameMinimoDto(Game entity) {
        id = entity.getId();
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        title = entity.getTitle();
    }

    public GameMinimoDto(GameMinimoProjection projection) {
        id = projection.getId();
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();
        year = projection.getYear();
        title = projection.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
