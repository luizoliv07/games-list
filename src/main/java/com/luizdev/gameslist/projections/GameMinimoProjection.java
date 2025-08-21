package com.luizdev.gameslist.projections;

public interface GameMinimoProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
