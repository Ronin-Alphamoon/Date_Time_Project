package date.and.time.project;

public class DateAndTimeProject {
        
    public static void main(String[] args) {
        // TODO code application logic here       
       Datee myDate = new Datee(2011,01,01);
       //System.out.println(myDate.toString() );
       myDate.findWeekday();
      String[] weekdays = {"Sat","Sun","Mon","Tue","Wed","Thur","Fri"};
      String[] weekday2s = {"Fri","Thru","Wed","Tue","Mon","Sun","Sat"};
      int x = -7;

        System.out.println();
        if(x >= 0 ) {
         System.out.print( " (" +(x % 7) + ")" + weekdays[(x % 7)] ); 
         System.out.print( "|" + weekday2s[(x % 7)] ); 
        }else{
            System.out.print( " (" +( (-(x) % 7) )+ ")" + weekdays[( (-x % 7) )] ); 
            System.out.print( "|" + weekday2s[( ( -(++x) % 7) )] ); 
        }
    }
  

}