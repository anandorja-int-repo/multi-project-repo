package com.anandorja.learn;

import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file with its path and extension name:");
            String filePath = br.readLine();
            File file1 = new File(filePath);
            //FileOutputStream fos = new FileOutputStream(filePath);
            file1.createNewFile();
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write("This is my new code folks");
            myWriter.close();
            Scanner read = new Scanner(file1);
            System.out.println(read.nextLine());
            read.close();

            // coping the file
            System.out.println("Enter the file with its path and extension name:");
            String filePath2 = br.readLine();
            File file2 = new File(filePath2);
            FileInputStream in = new FileInputStream(file1);
            FileOutputStream out = new FileOutputStream(file2);
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
            out.close();
            in.close();

            /** // to append a existing file
             BufferedWriter out = new BufferedWriter(
             new FileWriter(fileName, true));
             out.write(str);
             out.close();
             */

            /** to rename a file  , returns true if the filename is renamed
            File file = new File("/home/mayur/Folder/GFG.java");
            File rename = new File("/home/mayur/Folder/HelloWorld.java");
            boolean flag = file.renameTo(rename);

            Path oldFile
                    = Paths.get("/home/mayur/Folder/GFG.java");

            try {
                Files.move(oldFile, oldFile.resolveSibling(
                        "HelloWorld.java"));
                System.out.println("File Successfully Rename");
            }
            catch (IOException e) {
                System.out.println("operation failed");
            }*/


        }
        catch (Exception e){
            System.out.println(e);
        }


        // Method createNewFile() method creates blank
        // file.

    }
}
