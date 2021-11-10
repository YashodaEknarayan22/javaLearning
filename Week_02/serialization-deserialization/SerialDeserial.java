/*
*class SerialDeserial implements serialization and deserialization of employee obj. 
**/

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SerialDeserial{
    public static void main(String []args) throws IOException, ClassNotFoundException, NullPointerException
    {
        Employee em=new Employee();
        em.id=101;
        em.name="Yashoda";
        em.designation="Developer";
        em.age=23;
        
        /*Serialization*/
        try{
            FileOutputStream outFile=new FileOutputStream("EmployeeData.txt");
            ObjectOutputStream objOut=new ObjectOutputStream(outFile);
            objOut.writeObject(em);
            objOut.close();
            outFile.close();
            System.out.println("Serialized data saved in Employee.txt");
            System.out.println("<-------Serialized Data------>");
            System.out.println("Employee Id: "+em.id);
            System.out.println("Employee Name: "+em.name);
            System.out.println("Employee Designation: "+em.designation);
            System.out.println("Employee Age: "+em.age);        
        }
        catch(IOException i){
            i.printStackTrace();
        }
        
        /*Deserialization*/
        //em=null;
        try{
            FileInputStream inputFile= new FileInputStream("EmployeeData.txt");
            ObjectInputStream objIn=new ObjectInputStream(inputFile);
            em=(Employee)objIn.readObject();
            objIn.close();
            inputFile.close();
            
        }
        catch(IOException i){
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c){
            System.out.println("Employee Class Not Found!");
            c.printStackTrace();
            return;
        }
        
        finally{ 
        System.out.println("<-------Deserializing Employee-------->");
        System.out.println("Employee Id: "+em.id);
        System.out.println("Employee Name: "+em.name);
        System.out.println("Employee Designation: "+em.designation);
        System.out.println("Employee Age: "+em.age);
        
        }
        
    }
}

