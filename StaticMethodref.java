interface Functional
{
    void fun();
}
public class StaticMethodref{
    static void Contain(){
        System.out.println("Ok this is static method referencing");
    }
    public static void main(String args[]){
    Functional f=StaticMethodref::Contain;
    f.fun();
}
}