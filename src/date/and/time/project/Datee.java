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
       setYearState(inputYear);
       setMonthState(inputMonth);
       setDayState(inputDay);

    
    }

    @Override
    public String toString() {
        String defualt =  REF_YEAR + " " + REF_MONTH + " " + REF_DAY + " " + REF_WEEKDAY;
        String user = getYearState() + ", " + getMonthState() + ", " + getDayState() + ", "+ getWeekday();
        return "Datee{"  + user +  "}";
    }

    public static int getYearState() {
        return yearState;
    }

    public static void setYearState(int aYearState) {
        yearState = aYearState;
    }

    public static int getMonthState() {
        return monthState;
    }

    public static void setMonthState(int aMonthState) {
        monthState = aMonthState;
    }

    public static int getDayState() {
        return dayState;
    }

    public static void setDayState(int aDayState) {
        dayState = aDayState;
    }

    public static String getWeekday() {
        return weekday;
    }

    public static void setWeekday(String aWeekday) {
        weekday = aWeekday;
    }
    
    
    public static String printFormatedDate( String myDate){
        String formatedDateString;
        //SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE YYYY/MM/dd");
        formatedDateString =" u\002F ";    
        return "Your full date is " + formatedDateString;
    }
}
