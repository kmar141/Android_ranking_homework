package com.example.kieran.toptracks;

/**
 * Created by Kieran on 05/07/2017.
 */

public class Track {

    private int ranking;
    private String title;

    public Track(Integer ranking, String title) {
        this.ranking = ranking;
        this.title = title;

    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }


}


