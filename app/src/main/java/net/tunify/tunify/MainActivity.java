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
        for(int list=0; list<=10; list++){
            MusicList musicList = new MusicList(
                    "Alien",
                    "Sabrina Carpenter ft. Jonas Blue x Marsmallow",
                    "#"+ (list+1)
            );

            musicLists.add(musicList);
        }

        mAdapter = new MusicListAdapter(musicLists,this);

        mRecylerView.setAdapter(mAdapter);
    }
}
