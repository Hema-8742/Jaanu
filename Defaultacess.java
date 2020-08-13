class Data {
    default String name;
}

public class Defaultaccess {
    public static void main(String[] args[])
    {
        Data d=new Data();
        d.name = "not possible";
    }
}