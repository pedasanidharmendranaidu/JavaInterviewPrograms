package javaFilePrograms;

import java.io.File;

public class ListAlltheFile {
    public static void main(String[] args) {
        File file=new File("C:\\");

        String[] list = file.list();
        for (String file1:list){
            System.out.println(file1.getBytes().length);

        }
    }
}
