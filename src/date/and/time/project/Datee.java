package date.and.time.project;

/**
 * @author Ronin
 */
public class Datee {
	
	
	private int centauryCode,centauryValue,decadeValue
				,monthCode,weekdayPosition;
	
	private int year = 1400,month = 01,day = 01;
    
	private String[] weekChart = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
	
	private int[] monthChart = {0,3,3,6,1,4,6,2,5,0,3,5};
	
	private int[] centauryChart = {2,0,6,4};
    
    public Datee(int year,int month,int day) { 
       setYear(year);
       setMonth(month);
       setDay(day);

    }

    
    private void setCentCode() {
    	
    	int centIndex = 0;
    	centauryValue = Integer.parseInt(String.valueOf( getYear() ).substring(0, 2));
    	centIndex = (centauryValue - 14) % 4;
    	centauryCode = centauryChart[centIndex];
    				
	}

    
    
    public String toString() {
        return "Datee{"  + getYear() + "," + getMonth() + "," + getDay() + ","+ getWeekday() +  "}";
    }

    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
       if (year >= 1400) {
		this.year = year;
	}
    else {
    	  System.out.println("Year out of bound");
    }
    	
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        
        if (month <= 12 && month >= 1){
            this.month = month;
        }else{
            System.out.println("Incorrect month");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        
        if ( (getMonth() != 2) && (day <= 31 && day >= 1) ){
        	
            this.day = day;
        }
//        else if ( (getMonth() != 2) && (day <= 31 && day >= 1) ){
//        	
//            this.day = day;
//        }
        else if( (getMonth() == 2 && isLeapYear( getYear() ) ) && (day <= 29 && day >= 1) ) {
        	
        	this.day = day;
		}
        else if( (getMonth() == 2 && !isLeapYear( getYear() ) ) && (day <= 28 && day >= 1) ) {
			
        	this.day = day;
		}
        else{
            System.out.println("Incorrect day");
        }
    }

    public String getWeekday() {
        return findWeekday();
    }
    
    private String findWeekday() {
    	
    	monthCode = monthChart[ getMonth() - 1 ];
    	decadeValue = Integer.parseInt(String.valueOf( getYear() ).substring(2, 4));
    	setCentCode();
    	
    	weekdayPosition = getDay() + monthCode + centauryCode + decadeValue + Math.floorDiv(decadeValue, 4);
    	weekdayPosition =  weekdayPosition % 7;
    	
        if( isLeapYear( getYear() ) ){
            weekdayPosition -= 1;
            weekdayPosition =  weekdayPosition < 0 ? weekdayPosition + 7 : weekdayPosition;
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
