import java.util.Scanner;
public class LeapYear {
    public void Year(){
    Scanner keys = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = keys.nextInt();
    keys.nextLine();
    if(year%400==0){
        System.out.println("this is a leap year");
    }
    else if(year%4==0&& year%100!=0){
        System.out.println("this is a leap year");
    }
    else{
        System.out.println("this is not a leap year");
    }
    }
    }

   
