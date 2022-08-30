package date.and.time.project;
/**
 * @author Ronin
 */
public class Datee {
    
private final static String[][] weekdays = {  {"6","Monday"},
                                        {"5","Tuesday"},
                                        {"4","Wenesday"},
                                        {"3","Thurday"},
                                        {"2","Friday"},
                                        {"1","Staturady"},
                                        {"0","Sunday"} };

    private final static int REF_YEAR = 2000;
    private final static int REF_MONTH = 1;
    private final static int REF_DAY = 1;
    private final static String REF_WEEKDAY = "Sunday";
    private static int yearState;
    private static int monthState;
    private static int dayState;
    private static String weekday;

    public Datee(int inputYear,int inputMonth,int inputDay) {
        
       yearState = inputYear;
       monthState = inputMonth;
       dayState = inputDay;

    
    }

    @Override
    public String toString() {
        return "Datee{" + yearState + ", " + monthState + ", " + dayState + ", "+ weekday + '}';
    }
    
    
}
