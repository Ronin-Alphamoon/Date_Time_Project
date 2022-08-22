package date.and.time.project;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndTimeProject {
    
    static Scanner consoleScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println( formatDate( new Date()) + getDate());
        
    }
    
    public static Date getDate(){
 
        int userMonth ,userYear , userDay ;
       
        System.out.print("Enter year as Number: ");
        userYear = consoleScanner.nextInt();
        System.out.print("Enter month as Number: ");
        userMonth = consoleScanner.nextInt() - 1;
        System.out.print("Enter day as Number: ");
        userDay = consoleScanner.nextInt();
        
        Calendar myCalender = new GregorianCalendar(userYear,userMonth,userDay);
        
        return myCalender.getTime();
    }   
    public static String formatDate( Date myDate){
        String formatedDateString;
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE yyy/dd/mm");
        formatedDateString = dateFormatter.format(myDate);     
        return "Your full date is " + formatedDateString;
    }
}