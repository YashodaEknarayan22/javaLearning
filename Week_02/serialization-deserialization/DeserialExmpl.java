/*
* DeserialExmpl implements Deserialization on object of employee class.
**/

import java.io.*;

public class DeserialExmpl{
    public static void main(String []args){
        Employee em=null;
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