class Overriden
{
  public void meth1()
  {
     System.out.println("Base class property");
  }
}
class Methodoveriding extends Overriden
{
  public void meth1()
  {
     System.out.println("Child class property");
  }
  public static void main( String args[])
  {
     Methodoveriding obj = new Methodoveriding();
     obj.meth1();
  }
}