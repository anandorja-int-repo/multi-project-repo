package com.anandorja.learn.compareOrder;

import java.util.Comparator;

public class TitleCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return one.getMusic().compareTo(two.getMusic());
    }
}
