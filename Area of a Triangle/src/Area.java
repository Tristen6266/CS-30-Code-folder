import java.lang.Math;
public class Area {
    public void area(double a,double b,double c){
       double S = a+b+c;
       double area = S/2;
       double ans = Math.sqrt(area*(area-a)*(area-b)*(area-c));
       System.out.println(ans);

    }

}
