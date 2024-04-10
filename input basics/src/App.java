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
       

      

      Double DoubOne, DoubTwo; 

      System.out.print("Enter a Number :: ");

      DoubOne = keyboard.nextDouble();

 
      System.out.print("Enter a Number :: ");

      DoubTwo = keyboard.nextDouble();

      System.out.println("Double one = " + DoubOne);
      System.out.println("Double two = " + DoubTwo);
      System.out.println("added together = " +(DoubOne + DoubTwo));
    }
}
