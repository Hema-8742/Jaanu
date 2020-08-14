class Threadbasic extends Thread
{  
    public void run()
    {  
    System.out.println("thread is running...");  
    }  
    public static void main(String args[])
    {  
    Threadbasic t1=new Threadbasic();  
    t1.start();  
    }
}
 
    