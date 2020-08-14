class Test<T> 
{ 
    T obj; 
    Test(T obj) 
    {
        this.obj = obj;  
    } 
    public T getObject()
    { 
        return this.obj;
    } 
} 
class Genericview
{ 
    public static void main (String[] args) 
    { 
    
        Test <Integer> hObj = new Test<Integer>(15); 
        System.out.println(hObj.getObject()); 
        Test <String> tObj =new Test<String>("GeeksForGeeks"); 
        System.out.println(tObj.getObject()); 
    } 
}