package javaSerializationPro;

import java.io.*;

public class EmployeeDeserialization{


    public static void main(String[] args) {

        try {


            InputStream inputStream = new FileInputStream("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaSerializationPro\\emp.text");

            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            System.out.println("DEserialization process has to be started::");
            Object employeeSerial;
            while (!((employeeSerial=objectInputStream.readObject()) instanceof EofIndicator)) {
                System.out.println(employeeSerial);
            }

            objectInputStream.close();
            inputStream.close();
        }catch (EOFException exception){
            exception.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("deserializable ended:::");

    }


}
