package net.tunify.tunify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
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
                "1",
                "[Verse 1]\nWe found each other\nI helped you out of a broken place\nYou gave me comfort\nBut falling for you was my mistake\n[Pre-Chorus]\nI put you on top, I put you on top\nI claimed you so proud and openly\nAnd when times were rough, when times were rough\nI made sure I held you close to me\n\n[Chorus]\nSo call out my name (call out my name)\nCall out my name when I kiss you so gently\nI want you to stay (want you to stay)\nI want you to stay even though you don't want me\nGirl, why can't you wait? (why can't you wait, baby?)\nGirl, why can't you wait 'til I fall out of love?\nWon't you call out my name? (call out my name)nGirl, call out my name, and I'll be on my way and\nI'll be on my—\n",
                "My Dear Melancholy",
                "The Weeknd's 2016 album, Starboy, was the musical equivalent of a Hollywood blockbuster: action-packed, star-studded, with a little something for everyone. Here, he returns to his unfiltered, art-house roots with a release so intimate and tortured, you’ll feel like a fly on his bedroom wall. Stuttering snares, gauzy production, and R-rated lyrics about sex and drugs (“I got two red pills to take the blues away,” he coos through a vocoder on “Privilege”) paint a vivid picture of a brooding Lothario—one that strongly resembles the dark artist we initially met on House of Balloons. This time around, he’s tapped gothic electro king Gesaffelstein, who has also produced for Kanye West, to bring a sheen to the shadows with neon synths and fuzzy echoes that lift his signature anguish into new emotional heights.",
                "2018",
                "R&B/Soul",
                R.drawable.cover1,
                R.drawable.thumbnails1,
                "rsEne1ZiQrk"

        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "IDGAF",
                "Dua Lipa",
                "2",
                "You call me all friendly\n" +
                        "Tellin' me how much you miss me\n" +
                        "That's funny, I guess you've heard my songs\n" +
                        "Well, I'm too busy for your business\n" +
                        "Go find a girl who wants to listen\n" +
                        "'Cause if you think I was born yesterday\n" +
                        "You have got me wrong\n" +
                        "So I cut you off\n" +
                        "I don't need your love\n" +
                        "'Cause I already cried enough\n" +
                        "I've been done\n" +
                        "I've been movin' on since we said goodbye\n" +
                        "I cut you off\n" +
                        "I don't need your love, so you can try all you want\n" +
                        "Your time is up, I'll tell you why\n" +
                        "You say you're sorry\n" +
                        "But it's too late now\n" +
                        "So save it, get gone, shut up\n" +
                        "'Cause if you think I care about you now\n" +
                        "Well, boy, I don't give a fuck\n" +
                        "I remember that weekend\n" +
                        "When my best friend caught you creepin'\n" +
                        "You blamed it all on the alcohol\n" +
                        "So I made my decision\n" +
                        "'Cause you made your bed, sleep in it\n" +
                        "Play the victim and switch your position\n" +
                        "I'm through, I'm done\n" +
                        "So I cut you off\n" +
                        "I don't need your love\n" +
                        "'Cause I already cried enough\n" +
                        "I've been done\n" +
                        "I've been movin' on since we said goodbye\n" +
                        "I cut you off\n" +
                        "I don't need your love, so you can try all you want\n" +
                        "Your time is up, I'll tell you why\n" +
                        "You say you're sorry\n" +
                        "But it's too late now\n" +
                        "So save it, get gone, shut up\n" +
                        "'Cause if you think I care about you now\n" +
                        "Well, boy, I don't give a fuck\n" +
                        "I see you tryna' get to me\n" +
                        "I see you beggin' on your knees\n" +
                        "Boy, I don't give a fuck\n" +
                        "So stop tryna' get to me\n" +
                        "Tch, get up off your knees\n" +
                        "'Cause, boy, I don't give a fuck\n" +
                        "About you\n" +
                        "No, I don't give a damn\n" +
                        "You keep reminiscin' on when you were my man\n" +
                        "But I'm over you\n" +
                        "Now you're all in the past\n" +
                        "You talk all that sweet talk, but I ain't comin' back\n" +
                        "Cut you off\n" +
                        "I don't need your love\n" +
                        "So you can try all you want\n" +
                        "Your time is up, I'll tell you why\n" +
                        "(I'll tell you why)\n" +
                        "You say you're sorry\n" +
                        "But it's too late now\n" +
                        "So save it, get gone, shut up\n" +
                        "(Too late now)\n" +
                        "'Cause if you think I care about you now\n" +
                        "Well, boy, I don't give a fuck\n" +
                        "(Boy, I don't give a fuck)\n" +
                        "I see you tryna' get to me\n" +
                        "I see you beggin' on your knees\n" +
                        "Boy, I don't give a fuck\n" +
                        "So stop tryna' get to me (Get to me)\n" +
                        "Tch, get up off your knees\n" +
                        "'Cause, boy, I don't give a fuck\n",
                "Dua Lipa",
                "The video premiered on 12 January 2018. It took 22 hours to shoot. According to Scholfield, the idea behind the video was to \"embody the sense of empowerment in the track, whilst going beyond the literal breakup context\". Lipa stated that the video is about \"your stronger and weaker side fighting with each other only to realize that self-love is what will help you overcome any negativity that comes your way.",
                "2018",
                "Pop",
                R.drawable.cover2,
                R.drawable.thumbnails2,
                "Mgfe5tIwOj0"

        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "The Middle",
                "Zedd, Maren Morris, and Grey",
                "3",
                "Take a seat\n" +
                        "Right over there, sat on the stairs\n" +
                        "Stay or leave\n" +
                        "The cabinets are bare and I'm unaware\n" +
                        "Of just how we got into this mess\n" +
                        "Got so aggressive\n" +
                        "I know we meant all good intentions\n" +
                        "\n" +
                        "So pull me closer\n" +
                        "Why don't you pull me close\n" +
                        "Why don't you come on over\n" +
                        "I can't just let you go\n" +
                        "\n" +
                        "Oh baby\n" +
                        "Why don't you just meet me in the middle\n" +
                        "I'm losing my mind just a little\n" +
                        "So why don't you just meet me in the middle\n" +
                        "In the middle\n" +
                        "Baby\n" +
                        "Why don't you just meet me in the middle\n" +
                        "I'm losing my mind just a little\n" +
                        "So why don't you just meet me in the middle\n" +
                        "In the middle\n" +
                        "\n" +
                        "Take a step\n" +
                        "Back for a minute, into the kitchen\n" +
                        "Floors are wet\n" +
                        "And taps are still running, dishes are broken\n" +
                        "How did we get into this mess\n" +
                        "Got so aggressive\n" +
                        "I know we meant all good intentions\n" +
                        "\n" +
                        "So pull me closer\n" +
                        "Why don't you pull me close\n" +
                        "Why don't you come on over\n" +
                        "I can't just let you go\n" +
                        "\n" +
                        "Oh baby\n" +
                        "Why don't you just meet me in the middle\n" +
                        "I'm losing my mind just a little\n" +
                        "So why don't you just meet me in the middle\n" +
                        "In the middle\n" +
                        "\n" +
                        "Looking at you I can't lie\n" +
                        "Just pouring out admission\n" +
                        "Regardless my objection\n" +
                        "And it's not about my pride\n" +
                        "I need you on my skin just\n" +
                        "Come over, pull me in just\n" +
                        "\n" +
                        "Oh baby\n" +
                        "Why don't you just meet me in the middle\n" +
                        "I'm losing my mind just a little\n" +
                        "So why don't you just meet me in the middle\n" +
                        "In the middle, no no\n" +
                        "\n" +
                        "Baby\n" +
                        "Why don't you just meet me in the middle, oh yeah\n" +
                        "I'm losing my mind just a little\n" +
                        "So why don't you just meet me in the middle, oh\n" +
                        "In the middle\n" +
                        "Baby\n" +
                        "Why don't you just meet me in the middle, baby\n" +
                        "I'm losing my mind just a little\n" +
                        "So why don't you just meet me in the middle, middle\n" +
                        "In the middle, middle\n",
                "The Middle",
                "Zedd said in a press release that they \"worked really hard on this record to get it just right\". He also opened up about the opportunity to work with both collaborators, stating that working with Morris was \"super fun because she is clearly an amazing singer and very talented musician\", and that he loves working with Grey because they strive to \"make the best music possible\". Morris added: \"Zedd was so great to work with and so easy-going, it felt like we'd been working together for years. The sound is reflective of my many influences as an artist – a little bit country, little pop, little R&B, relatable, emotional and catchy as hell. There are no limits with this song and I can't wait to see how the fans react.\" She revealed in a statement that she recorded her vocal for the song with Zedd in Nashville \"several weeks ago\" before the song's release. Grey admitted that they faced a few obstacles during production, but they \"kept fighting for it\" because the song was special.",
                "2018",
                "Pop",
                R.drawable.cover3,
                R.drawable.thumbnails3,
                "Lj6Y6JCu-l4"

        );
        musicLists.add(musicList);

        mAdapter = new MusicListAdapter(musicLists,this);

        //divider between
        mRecylerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        mRecylerView.setAdapter(mAdapter);
    }
}
