class Threadmethods extends Thread
{
    public void run()
    { 
        System.out.println("Thread RUN");  
    }  
   public static void main(String args[])
   {
        Threadmethods t1=new Threadmethods();  
        Threadmethods t2=new Threadmethods();
        System.out.println("Name of t1:"+t1.getName());  
        System.out.println("Name of t2:"+t2.getName());  
        System.out.println("id of t1:"+t1.getId());
        t1.start();  
        t2.start();
        t1.setName("Thread4362");  
        System.out.println("After changing name of t1:"+t1.getName());  
   }  
}  