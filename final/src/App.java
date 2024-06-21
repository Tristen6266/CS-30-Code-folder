import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         int num=0;
         int elite=0;
         int avearge=0;
        Scanner kb= new Scanner(System.in);
        while(num>=0){
        System.out.println("Please enter bowling score 0-300 (-1 to end)");
             num = kb.nextInt();
             kb.nextLine();
             if(num>=0&&num<=300){
                System.out.println("Your bowling score is: "+num);
                if(num>=200){
                    elite=elite+1;
                }
                else{
                    avearge=avearge+1;
                }
             }
             else if (num>300) {
                System.out.println("please enter valid score");
             }
             }
             double total= elite+avearge;
             System.out.println((elite/total)*100+" % of bowlers are elite");
             System.out.println((avearge/total)*100+" % of bowlers are average");

    }
}