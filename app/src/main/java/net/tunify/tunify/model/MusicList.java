package net.tunify.tunify.model;

/**
 * Created by Pandika on 3/31/2018.
 */

public class MusicList {
    private String judul_lagu;
    private String singer;
    private String num;

    public MusicList(String judul_lagu, String singer, String num) {
        this.judul_lagu = judul_lagu;
        this.singer = singer;
        this.num = num;
    }

    public String getJudul_lagu() {
        return judul_lagu;
    }

    public String getSinger() {
        return singer;
    }

    public String getNum() {
        return num;
    }
}
