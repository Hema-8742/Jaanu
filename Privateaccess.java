class Data {
    private String name;
}

public class Privateaccess {
    public static void main(String[] args[])
    {
        Data d=new Data();
        d.name = "not possible";
    }
} 