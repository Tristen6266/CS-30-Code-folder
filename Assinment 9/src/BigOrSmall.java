//Tristen Rapchalk
// BigOrSmall
//April 10 2024

import java.util.Scanner;
public class BigOrSmall {
    
        public void test(){
        Scanner keys = new Scanner(System.in);
       
        System.out.print("Enter a number for A: ");
         double a = keys.nextDouble();
        keys.nextLine();
        System.out.print("Enter another number for B: ");
         double b = keys.nextDouble();
         keys.nextLine();

         if(a>b){
            System.out.println("Yes");
         }
         else if(a<b){
            System.out.println("No");
         }
         else{
            System.out.println("Equals");
         }
    
    }
}


