import java.lang.System;
public class CoolNumbers {
    public static boolean isCoolNumber(int num){
       if (num%3==1 && num % 4==1 && num %5==1 && num %6==1 ){
        return true;
    }
    else{
        return false;
    }
} 
    public static void countCoolNumbers( int stop ) {
       int count=0;
       //for ( initial variable value; ending condition; steps/add i++)
        for (int num=6;num <= stop;num++){
            if(isCoolNumber(num)){
                count++;
            }
            
        }
        
      
        System.out.println(count+ " cool nubers between 6 and " +stop);
    }

}
