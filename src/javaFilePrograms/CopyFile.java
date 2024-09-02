package javaFilePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(new File("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaFilePrograms\\orifile.text"));
fileOutputStream=new FileOutputStream(new File("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaFilePrograms\\destfile.text"));
       int input=0;
       while ((input=fileInputStream.read())!=-1){
           fileOutputStream.write(input);
       }
            System.out.println("copied the file successfully");
        }catch (IOException e){
            e.printStackTrace();
        }



    }





}
