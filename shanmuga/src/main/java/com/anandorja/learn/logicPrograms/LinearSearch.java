package com.anandorja.learn.logicPrograms;

public class LinearSearch {
        static int search(int arr[], int n, int x)
        {
            n = arr.length;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }
}
