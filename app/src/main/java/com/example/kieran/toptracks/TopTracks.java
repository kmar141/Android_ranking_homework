package com.example.kieran.toptracks;



import java.util.ArrayList;

/**
 * Created by Kieran on 05/07/2017.
 */

public class TopTracks {

    private ArrayList<Track> list;


    public TopTracks() {
        list = new ArrayList<Track>();
        list.add(new Track(1, "Hofbrau"));
        list.add(new Track(2, "Palms"));
        list.add(new Track(3, "Link up"));
        list.add(new Track(4, "sylntways"));
        list.add(new Track(5, "Protect ya neck"));
        list.add(new Track(6, "So_rt"));
        list.add(new Track(7, "A bird in the hand"));
        list.add(new Track(8, "Deter"));
        list.add(new Track(9, "Major deals"));
        list.add(new Track(10, "5hundred"));
    }

        public ArrayList<Track> getList(){
            return new ArrayList<Track>(list);
        }

    }


