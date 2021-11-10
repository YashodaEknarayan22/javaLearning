/*
*class ThreadsWtSameObj implements thread that shares same object.
**/

class ThreadWtSameObj implements Runnable{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println("Hello World!");
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Exception!!!");
        }
    }
    
    public static void main(String []args)
    {
        ThreadWtSameObj obj=new ThreadWtSameObj();
        Thread one=new Thread(obj);
        Thread two=new Thread(obj);
        one.start();
        two.start();
    }
        
        
       
    
}