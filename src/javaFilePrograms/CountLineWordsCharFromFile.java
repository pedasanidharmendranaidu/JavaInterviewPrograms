package javaFilePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static javax.print.attribute.standard.MediaSizeName.C;

public class CountLineWordsCharFromFile {

    public static void main(String[] args) {

        int countLines=0;
        int countWords=0;
        int countChars=0;

       try {
           BufferedReader  bufferedReader=null;
           bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaFilePrograms\\linefile.text"));

           String currentLine = bufferedReader.readLine();
           while (currentLine!=null){

               countLines++;

               String[] s = currentLine.split(" ");
               countWords=countWords+s.length;
               for ( String word: s){
                   countChars=countChars+word.length();
               }

currentLine=bufferedReader.readLine();
           }
           System.out.println("no of lines: "+countLines);
           System.out.println("no of words: "+countWords);
           System.out.println("no of chars: "+countChars);

       }catch (Exception e){
        e.printStackTrace();
       }
    }

}
