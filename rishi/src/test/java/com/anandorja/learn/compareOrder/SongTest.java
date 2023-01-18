package com.anandorja.learn.compareOrder;

import junit.framework.TestCase;

import java.util.*;

public class SongTest extends TestCase {

    public void testSort(){
        List<Song> songList = new ArrayList<>(10);
        Song hababi = new Song("habibi");
        Song ale = new Song("ale ale");
        Song newyork = new Song("newyork");
        Song vikram = new Song("vikram");
        songList.add(hababi);
        songList.add(ale);
        songList.add(ale);
        songList.add(vikram);
        songList.add(newyork);
        songList.add(vikram);
        //System.out.println(songList+"\n");
        TitleComparator tcompare = new TitleComparator();
        //songList.sort(tcompare);
        songList.sort((one, two) -> one.getMusic().compareTo(two.getMusic()));
        assertEquals(songList.get(0).getMusic(), ale.getMusic());
        Set<Song> songSet = new HashSet<>(songList);
        //Set<Song> songSet = new TreeSet<>(songList);
        System.out.println(songSet);
    }
}