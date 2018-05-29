package net.tunify.tunify.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Pandika on 3/31/2018.
 */

public class MusicList implements Parcelable{
    private String title;
    private String singer;
    private String num;
    private String lyrics;
    private String album;
    private String fact;
    private String release;
    private String genre;
    private int coverId;
    private String youtubeId;
    private int chartId;


    public MusicList(String title, String singer, String num, String lyrics, String album, String fact, String release, String genre, int coverId, int musicVidId, String youtubeId, int chartId) {
        this.title = title;
        this.singer = singer;
        this.num = num;
        this.lyrics = lyrics;
        this.album = album;
        this.fact = fact;
        this.release = release;
        this.genre = genre;
        this.coverId = coverId;
        this.musicVidId = musicVidId;
        this.youtubeId = youtubeId;
        this.chartId=chartId;
    }

    protected MusicList(Parcel in) {
        title = in.readString();
        singer = in.readString();
        num = in.readString();
        lyrics = in.readString();
        album = in.readString();
        fact = in.readString();
        release = in.readString();
        genre = in.readString();
        coverId = in.readInt();
        chartId=in.readInt();
        youtubeId = in.readString();
        musicVidId = in.readInt();
    }

    public static final Creator<MusicList> CREATOR = new Creator<MusicList>() {
        @Override
        public MusicList createFromParcel(Parcel in) {
            return new MusicList(in);
        }

        @Override
        public MusicList[] newArray(int size) {
            return new MusicList[size];
        }
    };

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public int getMusicVidId() {
        return musicVidId;
    }

    public void setMusicVidId(int musicVidId) {
        this.musicVidId = musicVidId;
    }

    private int musicVidId;

    public int getCoverId() {
        return coverId;
    }

    public void setCoverId(int coverId) {
        this.coverId = coverId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(singer);
        parcel.writeString(num);
        parcel.writeString(lyrics);
        parcel.writeString(album);
        parcel.writeString(fact);
        parcel.writeString(release);
        parcel.writeString(genre);
        parcel.writeInt(coverId);
        parcel.writeInt(chartId);
        parcel.writeString(youtubeId);
        parcel.writeInt(musicVidId);
    }

    public int getChartId() {
        return chartId;
    }

    public void setChartId(int chartId) {
        this.chartId = chartId;
    }
}
