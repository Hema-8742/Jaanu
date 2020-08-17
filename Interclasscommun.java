class First{}
class Second{}
public class Interclasscommun
{

  public static void main(String[] args)
  {
     final First fr =new First();
     final Second se =new Second();

     Thread t1 = new Thread() {
        public void run()
        {
            synchronized(fr)
            {
                System.out.println("Thread1 is holding obj1");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                  // do something
                }
                synchronized(se)
                {  
                  System.out.println("Requesting for obj2"); 
                }
            }
        }
      };
      Thread t2 = new Thread() {
          public void run()
          {
              synchronized(se)
              {
                  System.out.println("Thread2 is holding obj2");
                  try {
                      Thread.sleep(1000);
                  }
                  catch(InterruptedException e){
                }
                  synchronized(fr)
                  {  
                      System.out.println("requesting for obj1"); 
                  }
              }
          }
      };

      t1.start();
      t2.start();
  }
}