package com.IdeaProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\FL_LPT-361\\Documents\\input.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\FL_LPT-361\\Documents\\output.txt");
        int c;
        while((c=fileInputStream.read())!=-1){
             fileOutputStream.write(c);
        }
        if(fileInputStream!=null){
            fileInputStream.close();
        }
        if(fileOutputStream!=null){
            fileOutputStream.close();
        }


    }
}
