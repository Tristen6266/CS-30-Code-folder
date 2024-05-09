public class loop {
    public static void Loops (int stop){
        int even=0;
        int sum=0;
        int odd=0;
        for(int num=1;num<=stop;num++){
         sum = sum + num;
           if (num%2==0){
             even++;
          }
           else{
           odd++;
           }
        }
        System.out.println("total "+ sum + "\nEven count "+ even+"\nOdd count "+ odd );
    }
}
