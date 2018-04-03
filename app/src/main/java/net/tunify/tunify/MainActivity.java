package net.tunify.tunify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.tunify.tunify.adapter.MusicListAdapter;
import net.tunify.tunify.model.MusicList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecylerView;
    private RecyclerView.Adapter mAdapter;

    private List<MusicList> musicLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecylerView = (RecyclerView) findViewById(R.id.rv_music);
        mRecylerView.setHasFixedSize(true);
        mRecylerView.setLayoutManager(new LinearLayoutManager(this));

        musicLists = new ArrayList<>();

        //just dummy data

        MusicList musicList = new MusicList(
                "Call Out My Name",
                "The Weeknd",
                "#1",
                "[Verse 1]\nWe found each other\nI helped you out of a broken place\nYou gave me comfort\nBut falling for you was my mistake\n[Pre-Chorus]\nI put you on top, I put you on top\nI claimed you so proud and openly\nAnd when times were rough, when times were rough\nI made sure I held you close to me\n\n[Chorus]\nSo call out my name (call out my name)\nCall out my name when I kiss you so gently\nI want you to stay (want you to stay)\nI want you to stay even though you don't want me\nGirl, why can't you wait? (why can't you wait, baby?)\nGirl, why can't you wait 'til I fall out of love?\nWon't you call out my name? (call out my name)nGirl, call out my name, and I'll be on my way and\nI'll be on my—\n",
                "My Dear Melancholy",
                "The Weeknd's 2016 album, Starboy, was the musical equivalent of a Hollywood blockbuster: action-packed, star-studded, with a little something for everyone. Here, he returns to his unfiltered, art-house roots with a release so intimate and tortured, you’ll feel like a fly on his bedroom wall. Stuttering snares, gauzy production, and R-rated lyrics about sex and drugs (“I got two red pills to take the blues away,” he coos through a vocoder on “Privilege”) paint a vivid picture of a brooding Lothario—one that strongly resembles the dark artist we initially met on House of Balloons. This time around, he’s tapped gothic electro king Gesaffelstein, who has also produced for Kanye West, to bring a sheen to the shadows with neon synths and fuzzy echoes that lift his signature anguish into new emotional heights.",
                "2018",
                "R&B/Soul",
                R.drawable.call_out_my_name,
                R.drawable.call_out_my_name_vid,
                "rsEne1ZiQrk"

        );

        musicLists.add(musicList);

        mAdapter = new MusicListAdapter(musicLists,this);

        mRecylerView.setAdapter(mAdapter);
    }
}
