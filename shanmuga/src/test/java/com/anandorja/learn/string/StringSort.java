package com.anandorja.learn.string;

public class StringSort {
    private String str;

    StringSort(String str) {
        this.str = str;
    }

    public String stringSorting() {
        char arr[] = str.toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr);
    }
}
