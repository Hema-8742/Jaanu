interface Interface1{
	public void method1();
	public void method2();
}
class Check implements Interface1{
	public void method1()
	{
		System.out.println("Currently working under switchboard team");
	}
	public void method2()
	{
		System.out.println("Currently working under teleport team");
		
	}
}
public class Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		c.method1();
		c.method2();
	}

}