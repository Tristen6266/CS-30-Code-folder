

public class App {
    public static void main(String[] args) throws Exception {
        int[] one={7,4,10,0,1,7,6,5,3,2,9,7};
        int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
        
         FunHouse run= new FunHouse();
         
         System.out.println("sum of spots 3-6  =  " + run.getSum(two,3,6));
         System.out.println("# of 4's is "+ run.getCount(two,4));
    }
}
