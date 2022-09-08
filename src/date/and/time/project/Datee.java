package date.and.time.project;

/**
 * @author Ronin
 */
public class Datee {
	
	private String[] weekChart = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
	private int[][] centauryChart = {
			{14,2},
			{15,0},
			{16,6},
			{17,4},
			{18,2},
			{19,0},
			{20,6},
			{21,4},
			{22,2},
			{23,0},
			{24,6},
			{25,4}};
	private int[] monthChart = {0,3,3,6,1,4,6,2,5,0,3,5};
	
	private int centauryCode = 0,centauryValue,decadeValue,monthCode,weekdayPosition;
    private int year;
    private int month;
    private int day;
    
    public Datee(int inputYear,int inputMonth,int inputDay) { 
       setYear(inputYear);
       setMonth(inputMonth);
       setDay(inputDay);

    }


    public String toString() {
        return "Datee{"  + getYear() + "," + getMonth() + "," + getDay() + ","+ getWeekday() +  "}";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int aYearState) {
        year = aYearState;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int aMonthState) {
        
        if (aMonthState <= 12 && aMonthState >= 1){
            month = aMonthState;
        }else{
            System.out.println("Incorrect month");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int aDayState) {
        
        if (aDayState <= 31 && aDayState >= 1){
            day = aDayState;
        }else{
            System.out.println("Incorrect day");
        }
    }

    public String getWeekday() {
        return findWeekday();
    }
    
    private String findWeekday() {
    	
    	monthCode = monthChart[ getMonth() - 1 ];
    	decadeValue = Integer.parseInt(String.valueOf( getYear() ).substring(2, 4));
    	centauryValue = Integer.parseInt(String.valueOf( getYear() ).substring(0, 2));
    	
    	for (int centIndex = 0; centIndex < centauryChart.length; centIndex++) {
    		
    		if( centauryChart[centIndex][0] == centauryValue) {
    			centauryCode = centauryChart[centIndex][1];
    			break;
    		}else {
    			centauryCode = 0;
    		}
			
		}
    	
    	weekdayPosition = getDay() + monthCode + centauryCode + decadeValue + Math.floorDiv(decadeValue, 4);
    	weekdayPosition =  weekdayPosition % 7;
    	
        if( isLeapYear( getYear() ) ){
            weekdayPosition -= 1;
            weekdayPosition =  weekdayPosition < 0? weekdayPosition + 7 : weekdayPosition;
        }
    	
    	return ( (weekChart[weekdayPosition]) );
    }
    
    public static boolean isLeapYear(int year) {
    	
    	 if( ( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0 ) ){
    		 return true;
    	 }else {
    		 return false;
    	 }

    }
    public static String printFormatedDate( Datee datee){
        String formatedDateString = "";
        
        formatedDateString = datee.getYear() + "/" + datee.getMonth() + "/" 
        					+ datee.getDay() + " " + datee.getWeekday(); 
        return "Your full date is " + formatedDateString;
    }
}
