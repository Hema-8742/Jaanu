import java.time.*;  
public class LocalDateclass{  
  public static void main(String[] args) {  
    LocalDate date1 = LocalDate.now(); 
    System.out.println("Today date: "+date1);
    LocalDate yesterday = date1.minusDays(1);
    System.out.println("Yesterday date: "+yesterday); 
    LocalDate tomorrow = yesterday.plusDays(2);   
    System.out.println("Tommorow date: "+tomorrow); 
    LocalDate date3 = LocalDate.of(2020, 8, 31);  
    System.out.println(date3.isLeapYear()); 
    LocalDate date2= LocalDate.of(2020, 8, 31);  
    LocalDateTime datetime = date2.atTime(1,50,9);      
    System.out.println(datetime);
    LocalDate specific2020 = LocalDate.of(2020, Month.AUGUST, 29);
    System.out.println("Specific Date="+specific2020);  
    LocalDate hundredDay2020 = LocalDate.ofYearDay(2020, 100);
    System.out.println("100th day of 2014="+hundredDay2020);
    }  
}  