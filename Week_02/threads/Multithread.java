/*
*Multithread class shows implementation of Multithreading
**/

import java.util.*;
class Multithread extends Thread
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int no=sc.nextInt();
        
        /*Thread to calculate sum of even numbers*/
        Multithread thread1=new Multithread()             //object1
        {
            public void run()
            {
                int i, evenSum=0;
                for(i=0;i<=no;i++)
                {
                    if(i%2==0)
                    {
                        evenSum=evenSum+i;
                    }
                    
                }
                System.out.println("Sum of all even numbers till "+no+" is "+evenSum);
            }
        };
        
        /*Thread to calculate sum of odd numbers*/
        Multithread thread2=new Multithread()             //object2
        {
            public void run()
            {
                
                int i, oddSum=0;
                for(i=0;i<=no;i++)
                {
                    if(i%2!=0)
                    {
                        oddSum=oddSum+i;
                    }
                    
                }
                System.out.println("Sum of odd numbers till "+no+" is "+oddSum);
            }
            
        };
        
        thread1.start();
        thread2.start();
    }
}
