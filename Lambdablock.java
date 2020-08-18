interface NumberFinder {
    int finder(int number1, int number2);
 }
 public class Lambdablock
 {
     public static void main(String args[])
     {
         NumberFinder numberFinder = (number1, number2) -> {
          int temp = 0;
          if(number1 > number2)
          {
             temp = number1;
          } else {
             temp = number2;
          }
          return temp;
       };
       System.out.println("The valus is : " + numberFinder.finder(10, 5));
    }
 }