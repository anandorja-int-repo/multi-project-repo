package com.anandorja.learn.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class FileWrite {
    public static void main(String[] args) throws IOException {
        File testFile = new File("C://Users//spsha//OneDrive//Desktop//Sundar//Java_File_Bascis//Test_Folder//sample.txt");
        testFile.createNewFile();
        try {

            FileWriter write = new FileWriter(testFile);
            write.write("Trying to write the file through java program");
            //write.flush();
            write.close();

            FileReader read = new FileReader(testFile);
            int output = read.read();
            while(!(output ==-1)){
                System.out.print((char)output);
                output = read.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}