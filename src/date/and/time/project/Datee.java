package date.and.time.project;

/**
 * @author Ronin
 */
public class Datee {
    
private final static String[][] weekdays = {
                                        {"Friday","Staturday"},
                                        {"Thursday","Sunday"}, 
                                        {"Wednesday","Monday"},  
                                        {"Tuesday","Tuesday"},
                                        {"Monday","Wednesday"},
                                        {"Sunday","Thursday"},
                                        {"Staturday","Friday"}};

    private final static int REF_YEAR = 2000;
    private final static int REF_MONTH = 1;
    private final static int REF_DAY = 1;
    private final static String REF_WEEKDAY = "Saturday";
    
    private static int yearState;
    private static int monthState;
    private static int dayState;
    private static String weekday = "Saturday";

    private static int yearDifferance;
    private static int monthDiffereance;
    private static int dayDiffereance;

    
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
        
        if (aMonthState <= 12 && aMonthState >= 1){
            monthState = aMonthState;
        }else{
            System.out.println("Incorrect month");
        }
    }

    public static int getDayState() {
        return dayState;
    }

    public static void setDayState(int aDayState) {
        
        if (aDayState <= 31 && aDayState >= 1){
            dayState = aDayState;
        }else{
            System.out.println("Incorrect day");
        }
    }

    public static String getWeekday() {
        return weekday;
    }

    public static void setWeekday(String aWeekday) {
        weekday = aWeekday;
    }
    
    public String findWeekday(){
        int leapYearCounter,positionOfDay;
        findDifferance();
        leapYearCounter = ( yearDifferance >= 0) ? ( yearDifferance / 4) : ( yearDifferance / 4 );
        leapYearCounter = (yearDifferance == 0 ) ? leapYearCounter  : (yearDifferance > 0) ? ++leapYearCounter : leapYearCounter;
        
        if( yearDifferance >= 0) {
            positionOfDay = (leapYearCounter + yearDifferance )%7;
            weekday = weekdays[ positionOfDay ][ 1 ];
            System.out.println( positionOfDay  + " <-- " + (weekdays[ positionOfDay ][1]) );

        }else{
            leapYearCounter = (yearDifferance >= -7 ) ? leapYearCounter  : leapYearCounter;
            positionOfDay = Math.abs(++yearDifferance + leapYearCounter) % 7;
            weekday = weekdays[ positionOfDay ][ 1 ];
            System.out.println( positionOfDay  + " <-- " + (weekdays[ positionOfDay ][0]) );
        }
        
        return weekday;
    }
    
    public static void findDifferance(){
    
        yearDifferance = getYearState() - REF_YEAR; 
        monthDiffereance = getMonthState() - REF_MONTH;
        dayDiffereance = getDayState() - REF_DAY;
 
    }
    
    public static String printFormatedDate( String myDate){
        String formatedDateString;
        //SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE YYYY/MM/dd");
        formatedDateString =" u\002F ";    
        return "Your full date is " + formatedDateString;
    }
}
