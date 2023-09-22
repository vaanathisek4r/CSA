public class MathEx {

    public static void main(String[] args){
        int swapper = swap(123);
        System.out.println(swapper);
       
   
    }
    public static int swap(int x){
        int hundreds = x/100*100;
        int tens = x%100%10*10;
        int ones = x%100/10;
        int result = hundreds+tens+ones;


        return result;
    }
   


}
