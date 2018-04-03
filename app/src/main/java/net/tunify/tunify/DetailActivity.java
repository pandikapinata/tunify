package net.tunify.tunify;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.tunify.tunify.model.MusicList;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MUSIC_ITEM = "music_extra";
    private static final String YOUTUBE_WATCH_URL = "https://www.youtube.com/watch?v=";

    CollapsingToolbarLayout mMusicVideo;
    ImageView mMudicCover;
    TextView mTitle;
    TextView mSinger;
    TextView mAlbum;
    TextView mRelease;
    TextView mGenre;
    TextView mFact;
    TextView mLyrics;
    MusicList musicList;


    public static void start(Context context, MusicList musicList) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_MUSIC_ITEM, musicList);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        musicList = getIntent().getParcelableExtra(EXTRA_MUSIC_ITEM);

        //setting music video
        mMusicVideo = findViewById(R.id.col_music_video);
        mMusicVideo.setBackgroundResource(musicList.getMusicVidId());

        //setting music cover
        mMudicCover = findViewById(R.id.img_cover);
        mMudicCover.setImageResource(musicList.getCoverId());

        mTitle = findViewById(R.id.tv_title);
        mTitle.setText(musicList.getTitle());

        mSinger = findViewById(R.id.tv_singer);
        mSinger.setText(musicList.getSinger());

        mGenre = findViewById(R.id.tv_genre);
        mGenre.setText(musicList.getGenre());

        mAlbum = findViewById(R.id.tv_album);
        mAlbum.setText(musicList.getAlbum());

        mRelease = findViewById(R.id.tv_release);
        mRelease.setText(musicList.getRelease());

        mFact = findViewById(R.id.tv_music_fact);
        mFact.setText(musicList.getFact());

        mLyrics = findViewById(R.id.tv_music_lyric);
        mLyrics.setText(musicList.getLyrics());

        mMusicVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Uri webpage = Uri.parse(YOUTUBE_WATCH_URL + musicList.getYoutubeId());
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                }
            }
        });

    }
}
