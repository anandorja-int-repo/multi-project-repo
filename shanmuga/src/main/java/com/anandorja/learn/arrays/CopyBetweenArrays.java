package com.anandorja.learn.arrays;

public class CopyBetweenArrays {
 public int[] copyArrays(int [] sourceArray,int[] destinationArray ){
    //int a[] = {1, 2, 3, 4, 5};
    destinationArray = sourceArray.clone();
       return destinationArray;
 }
}
