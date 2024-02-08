public class Complex {
    private double a;
    private double b;

    public Complex(double a, double b) { // Constructor 1
        this.a = a;
        this.b = b;
    }

    public Complex(double a) { // Constructor 2
        this(a ,0.0);
    }

    public double abs() {
        if (b == 0.0) return (Math.sqrt(a*a + b*b));
        return b;
    }

    public Complex add(Complex other) {
        return new Complex((a + other.a),(b + other.b));
    }

    public String toString() {
        return a + "+" + b + "i"; 
    }

    public Complex multiply(Complex other) {
        return (a * other.a) + (a * other.b) + (b * other.a) + (b * other.b);
    }

    public static void main(String[] args) {
        Complex c = new Complex(3,5);
        Complex c2 = new Complex(4,1);
        System.out.println("\nabs");
        System.out.println(c.abs());
        System.out.println("\nadd");
        System.out.println(c.add(c2));
        System.out.println("\ntoString");
        System.out.println(c.toString());
        System.out.println("\nmultiply");
        System.out.println(c.multiply(c2));
}
}