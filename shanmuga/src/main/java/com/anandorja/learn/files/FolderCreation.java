package com.anandorja.learn.files;
import java.io.File;
import java.io.IOException;

public class FolderCreation {
    public static void main(String[] args) throws IOException {
        File testFile = new File("C://Users//spsha//OneDrive//Desktop//Sundar//Java_File_Bascis//Test_Folder//sample.txt");
        testFile.mkdir();
    }
}