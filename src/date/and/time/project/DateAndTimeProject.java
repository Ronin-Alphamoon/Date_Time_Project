package date.and.time.project;

import java.util.Calendar;

public class DateAndTimeProject {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int month = 12,
            year = 2021,
            day = 23;
       // Date userDate = new Date(year,month,day);
        Calendar userDate = Calendar.getInstance();
       
        userDate.set(year, month, day);
        
        System.out.println(userDate);
        
    }
    
}
