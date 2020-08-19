class Encap
{
    private String name;
    private String idNum;
    private int age;
 
    public int getAge()
    {
       return age;
    }
    public String getName()
    {
       return name;
    }
 
    public String getIdNum()
    {
       return idNum;
    }
 
    public void setAge(int newAge)
    {
       age = newAge;
    }
 
    public void setName(String newName)
    {
       name = newName;
    }
 
    public void setIdNum(String newId)
    {
       idNum = newId;
    }
 }
 public class Encapsulation
 {

    public static void main(String args[]) {
       Encap encap = new Encap();
       encap.setName("Hema");
       encap.setAge(21);
       encap.setIdNum("4362");
 
       System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge() +  "Id :" + encap.getIdNum());
    }
 }