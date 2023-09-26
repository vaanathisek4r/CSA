public class MathEx {

    public static void main(String[] args){
        int swapper = swap(123);
        System.out.println(swapper);

        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
        
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6,22));
        System.out.println(dayOfWeek(5,4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));
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

    public static int dayOfWeek(int startweek, int date){
        int weekday = (date-1+startweek)%7;
        return weekday;
    }
}
