package date.and.time.project;

public class DateAndTimeProject {
        
    public static void main(String[] args) {
        // TODO code application logic here       
       Datee myDate1 = new Datee(1400,01,01);

      System.out.println(myDate1.toString() );
      System.out.println(Datee.printFormatedDate(myDate1));
      System.out.println(Datee.isLeapYear(2000));
      

    }
  

}