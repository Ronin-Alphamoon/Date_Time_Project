package date.and.time.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeProject {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println( formatDate( new Date()) );
    }
    
    public static String formatDate( Date myDate){
        String formatedDateString;
        
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE yyy/dd/mm");
        formatedDateString = dateFormatter.format(myDate);
        
        return "Your full date is " + formatedDateString;
    }
}
