// Tristen Rapchalk
// March 27 2024
// String basics

public class App {
    public static void main(String[] args) throws Exception {
        String messeage1= "I am very happy";
        String target1 = "very";

        String message2="That was great -lol";
        String target2= "lol";

       int x=messeage1.indexOf(target1);
       System.out.println(messeage1.substring(0,x)+ messeage1.substring(10));

       System.out.println(message2.replace(target2, " laugh out loud"));

    }
}
