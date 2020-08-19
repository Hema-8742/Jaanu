public class Parametrizedconstructor
{

    String name;
    int age;
    public Parametrizedconstructor(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Parametrizedconstructor(String name)
    {
        this.name = name;
    }
 
    public static void main(String[] args) {
 
        Parametrizedconstructor smudge = new Parametrizedconstructor("Vijay", 23);
        Parametrizedconstructor hema= new Parametrizedconstructor("Hema");
    }
 
 }