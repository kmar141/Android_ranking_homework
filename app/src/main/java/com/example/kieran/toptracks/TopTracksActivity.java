package com.example.kieran.toptracks;

import android.graphics.Track;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TopTracksActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_tracks);

        TopTracks topTracks = new TopTracks();
        ArrayList<Track> list = topTracks.getList();

        TopTracksAdapter trackAdapter = new TopTracksAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(trackAdapter);
    }

    public void getTrack(View listItem){
        Track track = (Track) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked ");
        sb.append(track.getTitle());

//        Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show());
        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);

        snackbar.setAction("Say Hello", this);

        snackbar.show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hello from Snackbar!", Toast.LENGTH_SHORT).show();
    }
}
