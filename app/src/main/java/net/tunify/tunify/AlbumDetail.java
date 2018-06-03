package net.tunify.tunify;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import net.tunify.tunify.adapter.AlbumMuicAdapter;
import net.tunify.tunify.adapter.MusicListAdapter;
import net.tunify.tunify.model.Album;
import net.tunify.tunify.model.MusicList;

import java.util.ArrayList;
import java.util.List;

public class AlbumDetail extends AppCompatActivity {
    public static final String EXTRA_ALBUM_ITEM = "album_extra";
    TextView album_title;
    TextView album_singer;
    TextView album_song;
    ImageView album_img;
    private Album album;
    private List<MusicList> musicLists;
    private AlbumMuicAdapter mAdapter;
    private RecyclerView mRecylerView;

    public static void start(Context context, Album album_list) {
        Intent intent = new Intent(context, AlbumDetail.class);
        intent.putExtra(EXTRA_ALBUM_ITEM, album_list);
        context.startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed(); return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        album_title = findViewById(R.id.album_name);
        album_singer = findViewById(R.id.album_singer);
        album_song =  findViewById(R.id.album_songs);
        album_img = findViewById(R.id.album_img);

        album = getIntent().getParcelableExtra(EXTRA_ALBUM_ITEM);


        getSupportActionBar().setTitle(album.getName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        album_title.setText(album.getName());
        album_song.setText(album.getNumOfSongs() + " songs");
        album_singer.setText(album.getSingert());
        Glide.with(this).load(album.getThumbnail()).into(album_img);
        musicLists = new ArrayList<>();
        MusicList musicList = new MusicList(
                "Wolves",
                "Selena Gomez and Marshmello",
                "9",
                "In your eyes, there's a heavy blue\n" +
                        "One to love and one to lose\n" +
                        "Sweet divide, a heavy truth\n" +
                        "Water or wine, don't make me choose\n" +
                        "I wanna feel the way that we did that summer night (night)\n" +
                        "Drunk on a feeling, alone with the stars in the sky\n" +
                        "I've been running through the jungle\n" +
                        "I've been running with the wolves\n" +
                        "To get to you, to get to you\n" +
                        "I've been down the darkest alleys\n" +
                        "Saw the dark side of the moon\n" +
                        "To get to you, to get to you\n" +
                        "I've looked for love in every stranger\n" +
                        "Took too much to ease the anger\n" +
                        "All for you, yeah, all for you\n" +
                        "I've been running through the jungle\n" +
                        "I've been crying with the wolves\n" +
                        "To get to you, to get to you (oh to get to you)\n" +
                        "Your fingertips trace my skin\n" +
                        "To places I have never been\n" +
                        "Blindly I am following\n" +
                        "Break down these walls and come on in\n" +
                        "I wanna feel the way that we did that summer night\n" +
                        "Drunk on a feeling, alone with the stars in the sky\n" +
                        "I've been running through the jungle\n" +
                        "I've been running with the wolves\n" +
                        "To get to you, to get to you\n" +
                        "I've been down the darkest alleys\n" +
                        "Saw the dark side of the moon\n" +
                        "To get to you, to get to you\n" +
                        "I've looked for love in every stranger\n" +
                        "Took too much to ease the anger\n" +
                        "All for you, yeah, all for you\n" +
                        "I've been running through the jungle\n" +
                        "I've been crying with the wolves\n" +
                        "To get to you, to get to you (oh to get to you)\n" +
                        "I've been running through the jungle\n" +
                        "I've been running with the wolves\n" +
                        "To get to you, to get to you\n" +
                        "I've been down the darkest alleys\n" +
                        "Saw the dark side of the moon\n" +
                        "To get to you, to get to you\n" +
                        "I've looked for love in every stranger\n" +
                        "Took too much to ease the anger\n" +
                        "All for you, yeah, all for you\n" +
                        "I've been running through the jungle\n" +
                        "I've been crying with the wolves\n" +
                        "To get to you, to get to you (oh to get to you)\n" +
                        " \n",
                "Wolves",
                "On August 15, 2017, Marshmello wrote that Gomez \"sounds absolutely incredible\" on the song, when replying to a fan who asked him to talk about the collaboration. During a radio interview with Tonya and Sonic on San Diego's Energy 103.7 FM, Gomez spoke of the collaboration: \"It's really cool. It's kind of in that world, his world, and I'm stepping into it and bringing my style too.\" She called it a beautiful song as well as one of her favorites.",
                "2017",
                "EDM",
                R.drawable._cover9,
                R.drawable._thumbnails9,
                "grLLLTza6k",
                R.drawable.arrow_down
        );

        musicLists.add(musicList);

        musicList = new MusicList(
                "These Days",
                "Rudimental feat. Jess Glynne, Macklemore, and Dan Caplen",
                "10",
                "I know you moved onto someone new\n" +
                        "Hope life is beautiful\n" +
                        "You were the light for me to find my truth\n" +
                        "I just wanna say, thank you\n" +
                        "Leaving to find my soul\n" +
                        "Told her I had to go\n" +
                        "And I know it ain't pretty\n" +
                        "When our hearts get broke\n" +
                        "Too young to feel this old\n" +
                        "Watching us both turn cold\n" +
                        "Oh, I know it ain't pretty\n" +
                        "When two hearts get broke\n" +
                        "Yeah, I know it ain't pretty\n" +
                        "When two hearts get broke\n" +
                        "I hope someday\n" +
                        "We'll sit down together\n" +
                        "And laugh with each other\n" +
                        "About these days, these days\n" +
                        "All our troubles\n" +
                        "We'll lay to rest\n" +
                        "And we'll wish we could come back to these days, these days\n" +
                        "These days, these days\n" +
                        "These days, these days\n" +
                        "Three years of ups and downs\n" +
                        "Nothing to show for it now\n" +
                        "And I know it ain't pretty when the fire burns out\n" +
                        "Calling me when I'm drunk, remind me of what I've done\n" +
                        "And I know it ain't pretty when you're trying to move on, yeah\n" +
                        "I hope someday\n" +
                        "We'll sit down together\n" +
                        "And laugh with each other\n" +
                        "About these days, these days\n" +
                        "All our troubles\n" +
                        "We'll lay to rest\n" +
                        "And we'll wish we could come back to these days, these days\n" +
                        "Oh I know, I know\n" +
                        "Oh I know, I know\n" +
                        "Oh I know, I know\n" +
                        "These days, these days\n" +
                        "Oh I know, I know\n" +
                        "Oh I know, I know\n" +
                        "Oh I know, I know\n" +
                        "To these days, these days\n" +
                        "Cigarettes in the ash tray\n" +
                        "Reminiscing on those past days\n" +
                        "I thought you’d end up with my last name\n" +
                        "But that changed\n" +
                        "And I travelled around the world\n" +
                        "Think where you living at now?\n" +
                        "I heard you moved to Oxford\n" +
                        "Got an apartment and settled down\n" +
                        "And every once in a while\n" +
                        "I start texting\n" +
                        "Write a paragraph\n" +
                        "But then I delete the message\n" +
                        "Think 'bout you like a past time\n" +
                        "I could cry you a river\n" +
                        "Get you baptised or\n" +
                        "I wasn't ready to act right\n" +
                        "Used to always think I'd get you back, right\n" +
                        "They say that things fall apart (yeah)\n" +
                        "We were gonna move to Brooklyn\n" +
                        "You were gonna study Art (oh no, oh)\n" +
                        "Love is just a tool\n" +
                        "To remind us who we are\n" +
                        "And that we are not alone\n" +
                        "When we're walking in the dark\n" +
                        "I hope someday\n" +
                        "We'll sit down together\n" +
                        "And laugh with each other\n" +
                        "About these days, these days\n" +
                        "All our troubles\n" +
                        "We'll lay to rest\n" +
                        "And we'll wish we could come back to these days, these days\n" +
                        "We'll wish we could come back to these days, these days (these days, these days, these days)\n" +
                        "\n",
                "These Days",
                "\"These Days\" is a song by English drum and bass band Rudimental, featuring British singers Jess Glynne and Dan Caplen as well as American rapper Macklemore. It is the second single from Rudimental's upcoming album, following their UK top 10 hit \"Sun Comes Up\".\n" +
                        "After spending a record-equalling seven weeks at number two, the song reached number one in the UK on 30 March 2018, becoming Rudimental's third UK number-one single, Glynne's sixth, Macklemore's second and Caplen's first. This also made Glynne the British female with the most UK chart-toppers in history.\n",
                "2018",
                "EDM",
                R.drawable._cover10,
                R.drawable._thumbnails10,
                "pjTj-_55WZ8",
                R.drawable.circle_stay

        );
        musicLists.add(musicList);
        mRecylerView = findViewById(R.id.rv_album_songs);
        mRecylerView.setHasFixedSize(true);
        mRecylerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new AlbumMuicAdapter(this, musicLists);

        //divider between item
        mRecylerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecylerView.setAdapter(mAdapter);
    }
}
