public class FtoC {
    private double F,ans;
    
        
    public void setTemp(double temp){
        F=temp;
    }

    public void convert(){

        ans = 5.0/9* (F-32);

    }

    public void print(){
        System.out.println(ans);
    }
}
