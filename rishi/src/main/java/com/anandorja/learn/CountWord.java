package com.anandorja.learn;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;

public class CountWord {

    int count;
    HashMap<String,Integer> wc = new HashMap<String,Integer>();//Creating HashMap

    public void count (String line){
        String words[] = line.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            if( wc.containsKey(word) ){
                count = wc.get(word) + 1;
                wc.put(word,count);
            } else {
                wc.put(word,1);
            }
        }
    }

    public int fileWordCount(String filePath, String findWord){
        String line;
        findWord = findWord.toLowerCase();

        try {

            FileReader inputFile = new FileReader(filePath);
            BufferedReader br = new BufferedReader(inputFile);

            while((line = br.readLine()) != null) {
                count(line);
            }
            br.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        return checkCount(findWord);
    }

    public int lineWordCount(String line, String findWord){
        count(line.toLowerCase());
        return checkCount(findWord.toLowerCase());
    }

    public int checkCount(String findWord){
        if(wc.containsKey(findWord)){
            return wc.get(findWord);
        } else {
            return 0;
        }
    }
}
