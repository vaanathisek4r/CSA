public class Factorial {

    //PROBLEM 1
    public long calcFactorial(int num){
        long result = num;
        for(long a = num - 1; a > 0; a --){
            result = a * result; 
        }
        return result;
    } 
    
    public static void main(String [] args){
        Factorial fl = new Factorial();
        //PROBLEM 1
        for (int a = 20; a > 0; a--)
            System.out.println(fl.calcFactorial(a));
        }
        
}

