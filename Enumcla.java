enum Student {
    Surya(23), Rao(22), Hema(20), Shree(21);
    private int age; 
    int getage()
    { 
        return age;
    }
    Student(int age) 
    {
    this.age= age;
 }
}

class Enumcla {
    public static void main( String args[] )
    {
        Student S;
        System.out.println("Age of Victor is " +Student.Surya.getage()+ "years");
    }
}