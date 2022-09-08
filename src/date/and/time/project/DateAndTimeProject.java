package date.and.time.project;

public class DateAndTimeProject {
        
    public static void main(String[] args) {
        // TODO code application logic here       
       Datee myDate1 = new Datee(2022,9,8);
       Datee myDate2 = new Datee(1400,13,01);
       Datee myDate3 = new Datee(1400,12,32);

      System.out.println(myDate1.toString() );
      System.out.println(Datee.printFormatedDate(myDate1));
      System.out.println(myDate2.toString());
      System.out.println(Datee.printFormatedDate(myDate2));
      System.out.println(myDate3.toString());
      System.out.println(Datee.printFormatedDate(myDate3));
     
      

    }
  

}