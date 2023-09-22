public class MathEx {

    public static void main(String[] args){
        int swapper = swap(123);
        System.out.println(swapper);

        timeLeft(1,34,8,20);
        

    }

    public static int swap(int x){
        int hundreds = x/100*100;
        int tens = x%100%10*10;
        int ones = x%100/10;
        int result = hundreds+tens+ones;

        return result;
    }
    public static void timeLeft(int curHour,int cuMin, int depHour ,int depMin){

        int current = (curHour*60) + cuMin;
        int arrive = (depHour*60) + depMin;
        int time = arrive - current;
        
        

        System.out.println(time/60 + " hours and " + time%60 + " minutes");
    }
    


}
