//creating one concrete and one abstract method and running it
abstract class Mainclass {
	abstract public void firstMethod();
	public void secondMethod()
	{
		System.out.println("Concrete methods code");
	}
}
class Abstractclass extends Mainclass
{
	public void firstMethod()
	{
		System.out.println("Abstract methods code");
	}
public static void main(String args[])
{
	Abstractclass je=new Abstractclass();
	je.firstMethod();
}
}