/*
*SerialExmpl class implements serialization on object of Employee Class.
**/


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class SerialExmpl{
    public static void main(String []args){
        Employee em=new Employee();
        em.id=101;
        em.name="Yashoda";
        em.designation="Developer";
        em.age=23;
        
        try{
            FileOutputStream outFile=new FileOutputStream("EmployeeData.txt");
            ObjectOutputStream objOut=new ObjectOutputStream(outFile);
            objOut.writeObject(em);
            objOut.close();
            outFile.close();
            System.out.println("Serialized data saved in Employee.txt");
        }
        catch(IOException e){
            e.printStackTrace();
            
        }
    }
}
