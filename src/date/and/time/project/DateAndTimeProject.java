package date.and.time.project;

public class DateAndTimeProject {
        
    public static void main(String[] args) {
        // TODO code application logic here       
       Datee myDate = new Datee(1905,01,01);
       //System.out.println(myDate.toString() );
       myDate.findWeekday();
      String[] weekdays = {"Sat","Sun","Mon","Tue","Wed","Thur","Fri"};
      String[] weekday2s = {"Fri","Thru","Wed","Tue","Mon","Sun","Sat"};
      int x = -95;
      int leapYearCounter = (x >= 0) ? (x / 4) : ( x / 4 ) ;  
     
     // leapYearCounter = (x == 0 ) ? leapYearCounter  : ++leapYearCounter;


        if (x >= 0) {
            leapYearCounter = (x == 0 ) ? leapYearCounter  : ++leapYearCounter;
            System.out.print( "(" +((leapYearCounter + x )%7) + ")" +  weekdays[(leapYearCounter + x )%7] ); 
        } else {
            leapYearCounter = (x >= -7 ) ? leapYearCounter  : leapYearCounter;
            System.out.print( "(" +(Math.abs(x +1+ leapYearCounter) % 7) + ")" + weekday2s[ Math.abs(++x + leapYearCounter) % 7 ] );
        }
         

    }
  

}