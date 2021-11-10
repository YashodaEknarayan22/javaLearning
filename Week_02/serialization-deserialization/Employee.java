/*
* Serialization and Deserialization is performed on object of Employee class.
**/

import java.io.Serializable;
import java.util.*;

public class Employee implements Serializable{
    int id;
    String name;
    static String designation;
    transient int age;
}





