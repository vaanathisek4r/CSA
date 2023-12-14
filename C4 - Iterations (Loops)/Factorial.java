public class Factorial {

    //PROBLEM 1
    public long calcFactorial(int num){
        long result = num;
        for(long a = num - 1; a > 0; a --){
            result = a * result; 
        }
        return result;
    } 

    //PROBLEM 2
    public double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int x = 1;
        while(e-olde > .001){
            olde = e;
            e+= (1.0/calcFactorial(x));
            x ++;
        }
        return e;
    }

    //PROBLEM 3
    public double calcEX(int x){
        double e = 1.0;
        double olde = 0.0;
        int y = 1;
        while (e-olde > .001){
            olde = e;
            e += (Math.pow(x,y)/calcFactorial(y));
            y ++;
        }
        return e;
    }
    
    public static void main(String [] args){
        Factorial fl = new Factorial();
        // PROBLEM 1
        for (int a = 20; a > 0; a--)
            System.out.println(fl.calcFactorial(a));

        //PROBLEM 2
        System.out.println(fl.calcE());

        // PROBLEM 3
        for (int x = 1; x <=5; x ++)
        System.out.printf("e is %2.3f\n", fl.calcEX(x));
        }
}