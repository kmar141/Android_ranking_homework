package com.example.kieran.toptracks;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kieran on 05/07/2017.
 */

public class TopTracksAdapter extends ArrayAdapter<Track> {

    public TopTracksAdapter(Context context, ArrayList<Track> tracks){
        super(context, 0, tracks);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        // Check if the exisiting view is being reused, otherwise inflate the view
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_top_tracks, parent, false);
        }

        Track currentTrack = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentTrack.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentTrack.getTitle());


        listItemView.setTag(currentTrack);

        return listItemView;
    }
}

