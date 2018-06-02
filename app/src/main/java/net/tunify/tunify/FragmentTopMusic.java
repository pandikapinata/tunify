package net.tunify.tunify;

/**
 * Created by Pandika on 6/2/2018.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.tunify.tunify.adapter.MusicListAdapter;
import net.tunify.tunify.model.MusicList;

import java.util.ArrayList;
import java.util.List;

public class FragmentTopMusic extends Fragment{

    private RecyclerView mRecylerView;
    private RecyclerView.Adapter mAdapter;

    private List<MusicList> musicLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top_music, container, false);

        mRecylerView = (RecyclerView) rootView.findViewById(R.id.rv_music);
        mRecylerView.setHasFixedSize(true);
        mRecylerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        musicLists = new ArrayList<>();

        MusicList musicList = new MusicList(
                "FRIENDS",
                "Marshmello, Anne-Marie",
                "1",
                "Oooh oh, oooh woh\n" +
                        "Oooh oh, oooh woh\n" +
                        "\n" +
                        "You say you love me, I say you crazy\n" +
                        "We're nothing more than friends\n" +
                        "You're not my lover, more like a brother\n" +
                        "I know you since we were like ten, yeah\n" +
                        "\n" +
                        "Don't mess it up, talking that shit\n" +
                        "Only gonna push me away, that's it\n" +
                        "When you say you love me, that make me crazy\n" +
                        "Here we go again\n" +
                        "\n" +
                        "Don't go look at me with that look in your eye\n" +
                        "You really ain't going away without a fight\n" +
                        "You can't be reasoned with, I'm done being polite\n" +
                        "I've told you 1, 2, 3, 4, 5, 6 thousand times\n" +
                        "\n" +
                        "Haven't I made it obvious?\n" +
                        "Haven't I made it clear?\n" +
                        "Want me to spell it out for you?\n" +
                        "F-R-I-EN-D-S\n" +
                        "Haven't I made it obvious?\n" +
                        "Haven't I made it clear?\n" +
                        "Want me to spell it out for you?\n" +
                        "F-R-I-EN-D-S\n" +
                        "F-R-I-EN-D-S\n" +
                        "\n" +
                        "Have you got no shame, you looking insane\n" +
                        "Turning up at my door\n" +
                        "It's 2 in the morning, the rain is pouring\n" +
                        "Haven't we been here before?\n" +
                        "\n" +
                        "Don't mess it up, talking that shit\n" +
                        "Only gonna push me away, that's it\n" +
                        "Have you got no shame, you looking insane\n" +
                        "Here we go again\n" +
                        "\n" +
                        "So don't go look at me with that look in your eye\n" +
                        "You really ain't going away without a fight\n" +
                        "You can't be reasoned with, I'm done being polite\n" +
                        "I've told you 1, 2, 3, 4, 5, 6 thousand times\n" +
                        "\n" +
                        "Haven't I made it obvious? (Haven't I made it?)\n" +
                        "Haven't I made it clear? (Haven't I made it clear?)\n" +
                        "Want me to spell it out for you?\n" +
                        "F-R-I-EN-D-S\n" +
                        "Haven't I made it obvious?\n" +
                        "Haven't I made it clear? (Haven't I?)\n" +
                        "Want me to spell it out for you? (To spell it out for you?)\n" +
                        "F-R-I-EN-D-S\n" +
                        "F-R-I-EN-D-S\n" +
                        "\n" +
                        "F-R-I-EN-D-S\n" +
                        "That's how you fucking spell \"friends\"\n" +
                        "F-R-I-EN-D-S\n" +
                        "Get that shit inside your head\n" +
                        "No, no, yeah, uh, ahh\n" +
                        "F-R-I-EN-D-S\n" +
                        "We're just friends\n" +
                        "\n" +
                        "So don't go look at me with that look in your eye\n" +
                        "You really ain't going away without a fight\n" +
                        "You can't be reasoned with, I'm done being polite\n" +
                        "I've told you 1, 2, 3, 4, 5, 6 thousand times\n" +
                        "\n" +
                        "Haven't I made it obvious? (Have I not made it obvious?)\n" +
                        "Haven't I made it clear? (I made it very clear)\n" +
                        "Want me to spell it out for you? (yeah)\n" +
                        "F-R-I-EN-D-S (I said F-R-I-EN-D-S)\n" +
                        "Haven't I made it obvious? (I made it very obvious)\n" +
                        "Haven't I made it clear? (I made it very clear)\n" +
                        "Want me to spell it out for you?\n" +
                        "F-R-I-EN-D-S\n" +
                        "F-R-I-EN-D-S\n" +
                        "\n" +
                        "Ooh, ooh ooh, ooh ooh, ohh ohh ah\n" +
                        "Ahh oh, ahh oh, ahh oh\n",
                "Speak Your Mind",
                "Speaking about the song with London Evening Standard, Anne-Marie said: \"The idea came from a boy that I know that's my friend and he kind of he wanted to be more than my friend and I was like 'look brother how many times do I have to tell you we're just friends'. I thought it would be funny to write a song about it and there weren't that many songs about it and it works for Valentine's day for all the people who are single. I don't ever want him to know that it's about him because it's awkward. I do feel a bit bad but I'm trying to forget that it's about him and think about how funny it is about the situation.",
                "2018",
                "Pop, EDM-Pop",
                R.drawable._cover1,
                R.drawable._thumbnails1,
                "jzD_yyEcp0M",
                R.drawable.arrow_up

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
                R.drawable._cover2,
                R.drawable._thumbnails2,
                "Mgfe5tIwOj0",
                R.drawable.arrow_down

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
                R.drawable._cover3,
                R.drawable._thumbnails3,
                "Lj6Y6JCu-l4",
                R.drawable.arrow_up

        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "Mic Drop",
                "BTS feat. Desiigner and Steve Aoki",
                "4",
                "Yeah, who says my spoon is filthy?\n" +
                        "I don’t care, when I grab the mic, I beat them who got several golden spoons\n" +
                        "And lash out, there are many rare steaks not cooked properly\n" +
                        "Once again, I’ll be chewing over and over at the star's dinner\n" +
                        "Center of world business\n" +
                        "Number one favorite for casting, sold out\n" +
                        "Not many of this class, savor the value\n" +
                        "Stinking is a foul with this good scent\n" +
                        "Mic mic bungee\n" +
                        "\n" +
                        "Mic mic bungee\n" +
                        "Bright lights, forward\n" +
                        "You thought I was going down but I’m fine, sorry\n" +
                        "My bad, \"Billboard\"\n" +
                        "My bad, \"worldwide\"\n" +
                        "Sorry mom, your son is so killing it\n" +
                        "Should I chip in? For the duties you missed as a good child\n" +
                        "We never have empty seats in our concert\n" +
                        "I do it, I do it, you’re a tasteless ratatouille\n" +
                        "If you’re so jealous and it hurts then find a lawsuit and\n" +
                        "Sue it\n" +
                        "\n" +
                        "Did you see my bag? (where?) Did you see my bag? (where?)\n" +
                        "It's hella trophies and it's hella thick (hella thick, hella thick)\n" +
                        "What you think 'bout that? (well) What you think 'bout that? (well)\n" +
                        "I bet it got my haters hella sick (hella sick)\n" +
                        "Come and follow me, follow me with your signs up\n" +
                        "I'm so firin', firin', boy, your time's up\n" +
                        "Keep on runnin' and runnin' until I catch up\n" +
                        "How you dare? How you dare? How you dare?\n" +
                        "\n" +
                        "Another trophy, my hands carry 'em\n" +
                        "Too many that I can't even count 'em (turn it up now)\n" +
                        "Mic drop, mic drop\n" +
                        "Careful of your feet, careful of what you say\n" +
                        "Somebody stop me, I'm 'boutta pop off\n" +
                        "Too busy, you know my body ain't enough (turn it up now)\n" +
                        "Mic drop, mic drop\n" +
                        "Careful of your feet, careful of what you say\n" +
                        "\n" +
                        "Baby, watch your mouth (mouth), it come back around (round)\n" +
                        "Once upon a time (time), we learned how to fly (fly)\n" +
                        "Go look at your mirror, same damn clothes (git)\n" +
                        "You know how I feel, so damn happy (turn up)\n" +
                        "How many hours do we fly?\n" +
                        "I keep on dreamin' on the cloud\n" +
                        "Yeah, I'm on the mountain, yeah, I'm on the bay (pop)\n" +
                        "Everyday we vibin', mic drop, baam\n" +
                        "\n" +
                        "Did you see my bag? (where?) Did you see my bag? (where?)\n" +
                        "It's hella trophies and it's hella thick (hella thick, hella thick)\n" +
                        "What you think 'bout that? (well) What you think 'bout that? (well)\n" +
                        "I bet it got my haters hella sick (hella sick)\n" +
                        "Come and follow me, follow me with your signs up\n" +
                        "I'm so firin', firin', boy, your time's up\n" +
                        "Keep on runnin' and runnin' until I catch up\n" +
                        "How you dare? How you dare? How you dare?\n" +
                        "\n" +
                        "Another trophy, my hands carry 'em\n" +
                        "Too many that I can't even count 'em (turn it up now)\n" +
                        "Mic drop, mic drop\n" +
                        "Careful of your feet, careful of what you say\n" +
                        "Somebody stop me, I'm 'boutta pop off\n" +
                        "Too busy, you know my body ain't enough (turn it up now)\n" +
                        "Mic drop, mic drop\n" +
                        "Careful of your feet, careful of what you say\n" +
                        "\n" +
                        "Haters gon’ hate\n" +
                        "Players gon’ play\n" +
                        "Live a life, man\n" +
                        "Good luck\n" +
                        "\n" +
                        "No need to see you anymore, this is the last farewell\n" +
                        "Got no words to say, don’t even apologize\n" +
                        "No need to see you anymore, this is the last farewell\n" +
                        "Got no words to say, don’t even apologize\n" +
                        "See, you end up just like that\n" +
                        "Just so fizzy, we're like Coca-Cola\n" +
                        "Your corneas get shocked when you see us\n" +
                        "Cause we’re just too stylish\n",
                "Love Yourself : Her",
                "At a press conference, BTS member RM revealed that the song was inspired by former US president Barack Obama's mic drop at his last White House Correspondents' Dinner in 2016. \n" +
                        "BTS garnered attention in the US during 2017 after appearences and performances on music award shows and on the Billboard charts.\n",
                "2018",
                "Hip Hop",
                R.drawable._cover4,
                R.drawable._thumbnails4,
                "kTlv5_Bs8aw",
                R.drawable.arrow_up

        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "Havana",
                "Camila Cabello ft. Young Thug",
                "5",
                "Hey\n" +
                        "Havana, ooh na-na (ay)\n" +
                        "Half of my heart is in Havana, ooh-na-na (ay, ay)\n" +
                        "He took me back to East Atlanta, na-na-na\n" +
                        "Oh, but my heart is in Havana (ay)\n" +
                        "There's somethin' 'bout his manners (uh huh)\n" +
                        "Havana, ooh na-na (uh)\n" +
                        "He didn't walk up with that \"how you doin'?\" (uh)\n" +
                        "(When he came in the room)\n" +
                        "He said there's a lot of girls I can do with (uh)\n" +
                        "(But I can't without you)\n" +
                        "I knew him forever in a minute (hey)\n" +
                        "(That summer night in June)\n" +
                        "And papa says he got malo in him (uh)\n" +
                        "He got me feelin' like\n" +
                        "Ooh-ooh-ooh, I knew it when I met him\n" +
                        "I loved him when I left him\n" +
                        "Got me feelin' like\n" +
                        "Ooh-ooh-ooh, and then I had to tell him\n" +
                        "I had to go, oh na-na-na-na-na\n" +
                        "Havana, ooh na-na (ay, ay)\n" +
                        "Half of my heart is in Havana, ooh-na-na (ay, ay)\n" +
                        "He took me back to East Atlanta, na-na-na (uh huh)\n" +
                        "Oh, but my heart is in Havana (ay)\n" +
                        "My heart is in Havana (ay)\n" +
                        "Havana, ooh na-na\n" +
                        "Jeffery\n" +
                        "Just graduated, fresh on campus, mm\n" +
                        "Fresh out East Atlanta with no manners, damn\n" +
                        "Fresh out East Atlanta\n" +
                        "Bump on her bumper like a traffic jam\n" +
                        "Hey, I was quick to pay that girl like Uncle Sam (here you go, ay)\n" +
                        "Back it on me, shawty cravin' on me\n" +
                        "Get to diggin' on me (on me)\n" +
                        "She waited on me (then what?)\n" +
                        "Shawty cakin' on me, got the bacon on me (wait up)\n" +
                        "This is history in the makin' on me (on me)\n" +
                        "Point blank, close range, that be\n" +
                        "If it cost a million, that's me (that's me)\n" +
                        "I was gettin' mula, man they feel me\n" +
                        "Havana, ooh na-na (ay, ay)\n" +
                        "Half of my heart is in Havana, ooh-na-na (oh, ay, ay)\n" +
                        "He took me back to East Atlanta, na-na-na (oh no)\n" +
                        "Oh, but my heart is in Havana (ay)\n" +
                        "My heart is in Havana (ay)\n" +
                        "Havana, ooh na-na\n" +
                        "Ooh na-na, oh na-na-na (oo-ooh)\n" +
                        "Take me back, back, back like\n" +
                        "Ooh na-na, oh na-na-na (yeah, babe)\n" +
                        "Take me back, back, back like\n" +
                        "Ooh na-na, oh na-na-na (yea, yeah)\n" +
                        "Take me back, back, back like\n" +
                        "Ooh na-na, oh na-na-na (yea, babe)\n" +
                        "Take me back, back, back\n" +
                        "(Hey, hey)\n" +
                        "Ooh-ooh-ooh\n" +
                        "Ooh-ooh-ooh\n" +
                        "Take me back to my Havana\n" +
                        "Havana, ooh na-na\n" +
                        "Half of my heart is in Havana, ooh-na-na (oh, yeah)\n" +
                        "He took me back to East Atlanta, na-na-na (ay, ay)\n" +
                        "Oh, but my heart is in Havana\n" +
                        "My heart is in Havana (ay)\n" +
                        "Havana, ooh na-na\n" +
                        "Uh huh\n" +
                        "Oh na-na-na (oh na, yeah)\n" +
                        "Oh na-na-na\n" +
                        "Oh na-na-na\n" +
                        "No, no, no, take me back\n" +
                        "Oh na-na-na\n" +
                        "Havana, ooh na-na\n",
                "Camilla",
                "Its music video was directed by Dave Meyers and premiered on October 24, 2017. The video shows Cabello playing herself as Karla, as well as a telenovela actress and a movie protagonist, and features cameos by Lele Pons, LeJuan James, Noah Centineo, Marco DelVecchio and Mikey Pesante. A vertical video was also released, showing the singer and several dancers in a New York City subway, as well as a pianist's hands. ",
                "2017",
                "Latin, Pop",
                R.drawable._cover5,
                R.drawable._thumbnails5,
                "BQ0mxQXmLsk",
                R.drawable.arrow_down

        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "Sweet Talk",
                "Sheryl Sheinafia & Rizky Febian Feat Chandra Liow",
                "6",
                "when i’m up late and lonely\n" +
                        "and i’m just down to hoping\n" +
                        "know what i want to hear from you\n" +
                        " \n" +
                        "when the doubts pull me under\n" +
                        "and i need to receover\n" +
                        "know what i want to hear from you\n" +
                        " \n" +
                        "say baby say to me\n" +
                        "the words that keep me going\n" +
                        "yeah i know you know ’em\n" +
                        " \n" +
                        "say baby say to me\n" +
                        "the words that make me heal\n" +
                        "i love the way they feel\n" +
                        " \n" +
                        "you give me some of that\n" +
                        "some of that sweet sweet talk\n" +
                        "you give me some of that\n" +
                        "some of that sweet sweet talk\n" +
                        " \n" +
                        "say it again cause i need it\n" +
                        "sounding so good know you mean it\n" +
                        "some of that sweet sweet talk to me\n" +
                        " \n" +
                        "when my conscience breaking\n" +
                        "and it’s fear that i’m facing\n" +
                        "know what i want to hear from you (from you)\n" +
                        " \n" +
                        "when the clouds fill the sky up (sky up)\n" +
                        "know what i can rely on (rely on)\n" +
                        "know what i wanna hear from you\n" +
                        " \n" +
                        "say baby say to me\n" +
                        "the words that keep me going\n" +
                        "yeah i know you know ’em\n" +
                        " \n" +
                        "say baby say to me\n" +
                        "the words that make me heal\n" +
                        "i love the way they feel\n" +
                        " \n" +
                        "you give me some of that\n" +
                        "some of that sweet sweet talk\n" +
                        "you give me some of that\n" +
                        "some of that sweet sweet talk\n" +
                        " \n" +
                        "say it again cause i need it\n" +
                        "sounding so good know you mean it\n" +
                        "some of that, some of that sweet sweet talk to me\n" +
                        " \n" +
                        "[rap]\n" +
                        "yeah imma feeling so stuck, gridlock\n" +
                        "gimme some of that, uh, sweet talk\n" +
                        "i’ve been up all night, getting so blue\n" +
                        "but here comes chute to the rescue\n" +
                        "how did you do it, i’m a deadlock\n" +
                        "i gotta figure it out, imma be like sherlock\n" +
                        "wait, i don’t need to know\n" +
                        "you don’t need to show\n" +
                        "and just keep em words show\n" +
                        " \n" +
                        "ooh i love ooh i love that sweet talk (give me some of that)\n" +
                        "ooh i love ooh i love that sweet talk (sweet talk)\n" +
                        "never getting enough of that sweet talk, baby\n" +
                        "ooh i love ooh i love that sweet talk\n" +
                        " \n" +
                        "you give me some of that\n" +
                        "some of that sweet sweet talk\n" +
                        "you give me some of that\n" +
                        "some of that sweet sweet talk\n" +
                        " \n" +
                        "say it again cause i need it\n" +
                        "sounding so good know you mean it\n" +
                        "some of that, some of that sweet sweet talk to me\n" +
                        " \n" +
                        "ooh i love ooh i love that sweet talk\n" +
                        "ooh i love ooh i love that sweet talk\n" +
                        "never getting enough of that sweet talk, baby\n" +
                        "ooh i love ooh i love that sweet talk\n",
                "Sweet Talk",
                "Di single terbaru ini Sheryl mengajak dua artist muda berbakat yaitu Rizky Febian dan Chandra Liow untuk berkolaborasi. Sweet Talk bercerita tentang sepasang kekasih yang saling menyemangati lewat kata-kata. Berkolaborasi dengan musisi lain pun menuntut Sheryl untuk mencoba hal-hal baru, salah satunya di lagu ini Sheryl dituntut untuk melepaskan gitarnya dan menari. Video klip kali ini dikemas dengan format berbeda, format yang belum pernah dibuat sebelumnya, yaitu vertical video clip.",
                "2017",
                "Pop",
                R.drawable._cover6,
                R.drawable._thumbnails6,
                "2KNOQADH-7s",
                R.drawable.circle_stay


        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "New Rules",
                "Dua Lipa",
                "7",
                "One, one, one, one, one\n" +
                        "Talkin' in my sleep at night\n" +
                        "Makin' myself crazy\n" +
                        "(Out of my mind, out of my mind)\n" +
                        "Wrote it down and read it out\n" +
                        "Hopin' it would save me\n" +
                        "(Too many times, too many times)\n" +
                        "My love, he makes me feel like nobody else\n" +
                        "Nobody else\n" +
                        "But my love, he doesn't love me\n" +
                        "So I tell myself, I tell myself\n" +
                        "One, don't pick up the phone\n" +
                        "You know he's only calling 'cause he's drunk and alone\n" +
                        "Two, don't let him in\n" +
                        "You'll have to kick him out again\n" +
                        "Three, don't be his friend\n" +
                        "You know you're gonna wake up in his bed in the morning\n" +
                        "And if you're under him\n" +
                        "You ain't getting over him\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've gotta tell them to myself\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've gotta tell them to myself\n" +
                        "I keep pushin' forwards\n" +
                        "But he keeps pullin' me backwards\n" +
                        "(Nowhere to turn, no way)\n" +
                        "(Nowhere to turn, no)\n" +
                        "Now I'm standing back from it\n" +
                        "I finally see the pattern\n" +
                        "(I never learn, I never learn)\n" +
                        "But my love, he doesn't loves me\n" +
                        "So I tell myself, I tell myself\n" +
                        "I do, I do, I do\n" +
                        "One, don't pick up the phone\n" +
                        "You know he's only calling 'cause he's drunk and alone\n" +
                        "Two, don't let him in\n" +
                        "You have to kick him out again\n" +
                        "Three, don't be his friend\n" +
                        "You know you're gonna wake up in his bed in the morning\n" +
                        "And if you're under him\n" +
                        "You ain't getting over him\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've gotta tell them to myself\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've gotta tell them to myself\n" +
                        "Practice makes perfect\n" +
                        "I'm still tryna' learn it by heart (I got new rules, I count 'em)\n" +
                        "Eat, sleep, and breathe it\n" +
                        "Rehearse and repeat it 'cause I (I got new, I got new, I)\n" +
                        "One, don't pick up the phone\n" +
                        "You know he's only calling 'cause he's drunk and alone\n" +
                        "Two, don't let him in\n" +
                        "You have to kick him out again\n" +
                        "Three, don't be his friend\n" +
                        "You know you're gonna wake up in his bed in the morning\n" +
                        "And if you're under him\n" +
                        "You ain't getting over him\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've got new rules, I count 'em\n" +
                        "I've gotta tell them to myself\n" +
                        "I've got new rules, I count 'em (baby you know I count 'em)\n" +
                        "I've gotta tell them to myself\n" +
                        "Don't let him in, don't let him in\n" +
                        "Don't be his friend, don't be his friend\n" +
                        "Don't let him in, don't let him in\n" +
                        "Don't be his friend, don't be his friend\n" +
                        "You ain't getting over him\n",
                "Dua Lipa",
                "The music video for \"New Rules\" gained many positive reviews from critics, who praised its themes of female empowerment. As of February 2018, it has received over 1 billion views on YouTube. Its release also made Lipa debut on Billboard's Social 50 chart at number 26. Aliza Abarbanel of Refinery29 commented on the visual, \"'New Rules', and all the epic outfits in it, perfectly encapsulates the joy of female friendship—and the joy in getting dressed up together.\"  Paper's Claire Valentine labelled it Lipa's \"strongest video so far.\"",
                "2017",
                "Pop",
                R.drawable._cover7,
                R.drawable._thumbnails7,
                "k2qgadSvNyU",
                R.drawable.circle_stay

        );
        musicLists.add(musicList);

        musicList = new MusicList(
                "Meant To Be",
                "Bebe Rexha feat. Florida Georgia Line",
                "8",
                "Baby, lay on back and relax, kick your pretty feet up on my dash\n" +
                        "No need to go nowhere fast, let's enjoy right here where we at\n" +
                        "Who knows where this road is supposed to lead\n" +
                        "We got nothing but time\n" +
                        "As long as you're right here next to me, everything's gonna be alright\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, just let it be\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, just let it be\n" +
                        "So, won't you ride with me, ride with me?\n" +
                        "See where this thing goes\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, if it's meant to be\n" +
                        "I don't mean to be so uptight, but my heart's been hurt a couple times\n" +
                        "By a couple guys that didn't treat me right\n" +
                        "I ain't gon' lie, ain't gonna lie\n" +
                        "'Cause I'm tired of the fake love, show me what you're made of\n" +
                        "Boy, make me believe\n" +
                        "But hold up, girl, don't you know you're beautiful?\n" +
                        "And it's easy to see\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, just let it be\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, just let it be\n" +
                        "So, won't you ride with me, ride with me?\n" +
                        "See where this thing goes\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, if it's meant to be\n" +
                        "So, c'mon ride with me, ride with me\n" +
                        "See where this thing goes\n" +
                        "So, c'mon ride with me, ride with me\n" +
                        "Baby, if it's meant to be\n" +
                        "Maybe we do\n" +
                        "Maybe we don't\n" +
                        "Maybe we will\n" +
                        "Maybe we won't\n" +
                        "But if it's meant to be, it'll be, it'll be\n" +
                        "Baby, just let it be\n" +
                        "If it's meant to be, it'll be, it'll be (c'mon)\n" +
                        "Baby, just let it be (let's go)\n" +
                        "So, won't you ride with me, ride with me?\n" +
                        "See where this thing goes\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, if it's meant to be\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, if it's meant to be\n" +
                        "If it's meant to be, it'll be, it'll be\n" +
                        "Baby, if it's meant to be\n",
                "All Your Fault: Pt. 2",
                "It debuted as the Hot Country Songs chart, becoming Rexha's first entry on that chart and Florida Georgia Line's sixth number one. Rexha also became the first female artist to ever debut atop the chart and the third artist overall in country music history.  The song has spent 18 weeks at number one on the Hot Country Songs chart, surpassing Taylor Swift's \"We Are Never Ever Getting Back Together\" as the longest-running number one song on the chart for a lead female artist.  The song has sold 682,000 copies in the United States as of March 2018.",
                "2017",
                "Country Pop",
                R.drawable._cover8,
                R.drawable._thumbnails8,
                "zDo0H8Fm7d0",
                R.drawable.arrow_up

        );
        musicLists.add(musicList);

        musicList = new MusicList(
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

        mAdapter = new MusicListAdapter(musicLists,this.getActivity());

        //divider between item
        mRecylerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
        mRecylerView.setAdapter(mAdapter);

        return rootView;
    }


}
