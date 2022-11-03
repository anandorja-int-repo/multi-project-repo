package com.anandorja.learn;

public class VowelOrConsonant {
    public static int vowelOrConsonant(char letter){
        if(letter == 'a'|| letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u'||
                letter == 'A'||letter == 'E'||letter == 'I'||letter == 'O'||letter == 'U') {
            return 1;
        }
        else {
            return 0;
        }
    }
}
