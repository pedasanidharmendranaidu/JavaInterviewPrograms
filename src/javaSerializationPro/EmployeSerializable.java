package javaSerializationPro;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EmployeSerializable {
    public static void main(String[] args) {


        EmployeeSerial employeeSerial=new EmployeeSerial(1,"dharma");
        EmployeeSerial employeeSerial1=new EmployeeSerial(2,"max");


        try {
            OutputStream outputStream=new FileOutputStream("C:\\Users\\Dharma\\IdeaProjects\\JavaPrograms\\src\\javaSerializationPro\\emp.text");

            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            System.out.println("serialization process has to be started::");

         objectOutputStream.writeObject(employeeSerial);
            objectOutputStream.writeObject(employeeSerial1);
            objectOutputStream.writeObject(new EofIndicator());
          //  objectOutputStream.writeObject(new EmployeeSerial());
            //System.out.println("serialization process has to be started::");
       objectOutputStream.close();
       outputStream.close();
            System.out.println("endes");
        }catch (IOException exception){
            exception.printStackTrace();
        }





    }
}
