import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner keyboard = new Scanner(System.in);

      int intOne, intTwo; 

      System.out.print("Enter an integer :: ");

      intOne = keyboard.nextInt();

 
      System.out.print("Enter an integer :: ");

      intTwo = keyboard.nextInt();

      System.out.println("integer one = " + intOne);
      System.out.println("integer two = " + intTwo);
      System.out.println("added together = " +(intOne + intTwo));
       

      

      Double DubOne, DubTwo; 

      System.out.print("Enter a Number :: ");

      DubOne = keyboard.nextDouble();

 
      System.out.print("Enter a Number :: ");

      DubTwo = keyboard.nextDouble();

      System.out.println("Double one = " + DubOne);
      System.out.println("Double two = " + DubTwo);
      System.out.println("added together = " +(DubOne + DubTwo));
    }
}
