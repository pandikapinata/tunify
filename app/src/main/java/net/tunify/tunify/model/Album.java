package net.tunify.tunify.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Pandika on 6/2/2018.
 */

public class Album implements Parcelable{
    private String name;
    private int numOfSongs;
    private int thumbnail;
    private String singert;


    public Album(String singert, int numOfSongs, int thumbnail, String name) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
        this.singert = singert;
    }

    protected Album(Parcel in) {
        name = in.readString();
        numOfSongs = in.readInt();
        thumbnail = in.readInt();
        singert = in.readString();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSingert() {
        return singert;
    }

    public void setSingert(String singert) {
        this.singert = singert;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(numOfSongs);
        parcel.writeInt(thumbnail);
        parcel.writeString(singert);
    }
}
