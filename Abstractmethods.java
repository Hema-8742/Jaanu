//creating one concrete and one abstract method and running it
abstract class Abstract1
{
	abstract public void firstMethod();
	public void secondMethod()
	{
		System.out.println("Concrete methods code");
	}
}
class Abstractmethods extends Abstract1
{
	public void firstMethod()
	{
		System.out.println("Abstract methods code");
	}
public static void main(String args[])
{
	Abstractmethods je=new Abstractmethods();
	je.firstMethod();
}
}