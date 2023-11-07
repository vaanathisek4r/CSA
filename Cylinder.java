public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(double radius, double height){
        this.base = new Circle(radius);
        this.height = height;
        
    }
        public double vol(){
        return base.Area() * height;
        
    }
    public double sa(){
        return (2 * base.Area() + height * base.circumf());
        
    }
}

