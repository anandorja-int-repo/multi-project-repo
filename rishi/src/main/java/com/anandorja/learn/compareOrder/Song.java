package com.anandorja.learn.compareOrder;

public class Song {
    private String music;
    Song(String music){
        this.music = music;
    }
    public String getMusic(){
        return music;
    }

    @Override
    public String toString() {
        return music;
    }
//    @Override
//    public int hashCode() {
//        return music.hashCode();
//    }
//    @Override
//    public boolean equals(Object mTitle){
//        Song other = (Song) mTitle;
//        return music.equals(other.getMusic());
//    }
}
