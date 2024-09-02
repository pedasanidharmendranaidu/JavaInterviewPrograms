package javaSerializationPro;

import java.io.Serializable;

public class EmployeeSerial implements Serializable {
    private static final Long serialVersionUID=1l;
    private Integer id;
    private String name;
   public EmployeeSerial(Integer id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
