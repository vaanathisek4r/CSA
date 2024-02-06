package U2;
public class Circle {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double Area(){
        
        return Math.PI * Math.pow(radius, 2);
    }
    public double circumf(){
        return 2 * radius * Math.PI;
        
    }

}