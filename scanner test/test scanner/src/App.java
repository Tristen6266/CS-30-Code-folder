import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        //Scanner keys2 =new Scanner(System.in);
        // System.out.println("Scanner Demo Inputs");
        
        // System.out.println("Integers:");
        // int num= keys.nextInt();
        // System.out.println("The Number Was:"+ num);

        // System.out.println("Double:");
        // double dblnum= keys.nextDouble();
        // System.out.println("The Number Was:"+ dblnum);

        // System.out.println("Word:");
        // String word= keys.nextLine();
        // System.out.println("The Word Was:"+ word);

        System.out.print("Enter an integer: ");
        int num = keys.nextInt();
        keys.nextLine();
        System.out.print("Enter a Sentence: ");
        String sentence = keys.nextLine();
        System.out.println(num + " " + sentence);
        
        
    }
}
