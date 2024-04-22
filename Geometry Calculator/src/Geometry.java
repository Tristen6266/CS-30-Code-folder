import java.lang.Math;
public class Geometry {
    public void perimeter(double len, double wid) {
     double ans = 2*(len+wid);
        System.out.println(ans);
    }

   
    public void surfaceArea(double side) {
        double ans1 = 6*(side*side);


        System.out.println(ans1);
    }

    
    public void circleArea(double radius) {
        double ans2 = Math.PI*(radius*radius);
        
        System.out.println(ans2);

}
}
