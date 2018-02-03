package com.example.sinki.bai28_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.sinki.adapter.HinhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvHinh;
    ArrayList<Integer>dsHinh;
    HinhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        gvHinh = (GridView) findViewById(R.id.gvHinh);
        dsHinh = new ArrayList<>();
        dsHinh.add(R.drawable.android);
        dsHinh.add(R.drawable.apple);
        dsHinh.add(R.drawable.twitter);
        dsHinh.add(R.drawable.chrome);
        dsHinh.add(R.drawable.deviantart);
        dsHinh.add(R.drawable.dribbble);
        dsHinh.add(R.drawable.facebook);
        dsHinh.add(R.drawable.flickr);
        dsHinh.add(R.drawable.soundcloud);
        dsHinh.add(R.drawable.instagram);
        dsHinh.add(R.drawable.lastfm);
        dsHinh.add(R.drawable.linkedin);
        adapter = new HinhAdapter(MainActivity.this,R.layout.item,dsHinh);
        gvHinh.setAdapter(adapter);
    }
}
