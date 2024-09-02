package javaFilePrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostRepeatedWordInFile {


    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {

            //  bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaFilePrograms\\javaFile.text"));
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaFilePrograms\\destfile.text"));
            String currentLine = bufferedReader.readLine();

            HashMap<String, Integer> map = new HashMap<>();

            while (currentLine != null) {

                String[] words = currentLine.toLowerCase().split(" ");

                for (String word : words) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }

                currentLine = bufferedReader.readLine();
            }
            String mostRepeatedword = null;
            int count = 0;


            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                if (entry.getValue() > 1) {
                    mostRepeatedword = entry.getKey();
                    count = entry.getValue();
                }

            }
            System.out.println("mostReapeted word is : " + mostRepeatedword);
            System.out.println("occurence is : " + count);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
