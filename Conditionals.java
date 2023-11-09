public class Conditionals {
    public static void main(String [] arg){
        Conditionals ab = new Conditionals();
       /*  System.out.println(ab.chimpTrouble(true, true));
        System.out.println(ab.chimpTrouble(false, false));
        System.out.println(ab.chimpTrouble(true, false));
        System.out.println(ab.chimpTrouble(false, true));*/

        /*System.out.println(ab.negPos(1,-1, false));
        System.out.println(ab.negPos(-1,1, false));
        System.out.println(ab.negPos(1,1, false));
        System.out.println(ab.negPos(-1,-1, false));
        System.out.println(ab.negPos(-4,-5, false));
        System.out.println(ab.negPos(-4,5, false));
        System.out.println(ab.negPos(4,5, false));
        System.out.println(ab.negPos(4,-5, false));
        */

        /*System.out.println(ab.pickUpPhone(false, false, true));
        System.out.println(ab.pickUpPhone(true, true, true));
        System.out.println(ab.pickUpPhone(true, true, false));
        System.out.println(ab.pickUpPhone(false, true, false));
        System.out.println(ab.pickUpPhone(true, false, false));
        System.out.println(ab.pickUpPhone(false, false, false));*/

        /*System.out.println(ab.setAlarm(1, false));
        System.out.println(ab.setAlarm(5, false));
        System.out.println(ab.setAlarm (0, false));
        System.out.println(ab.setAlarm (2, true));
        System.out.println(ab.setAlarm (4, true));
        System.out.println(ab.setAlarm (6, true));*/

        /*System.out.println(ab.onesDigitSame (23, 19, 13));
        System.out.println(ab.onesDigitSame (23, 19, 12));
        System.out.println(ab.onesDigitSame (23, 19, 3));
        System.out.println(ab.onesDigitSame (423, 13, 3));
        System.out.println(ab.onesDigitSame (23, 29, 25));*/

        System.out.println(ab.blackjack(19, 21));
        System.out.println(ab.blackjack(21, 19));
        System.out.println(ab.blackjack(19, 22));
        System.out.println(ab.blackjack(8, 8));
        System.out.println(ab.blackjack(25, 24));
        System.out.println(ab.blackjack(17, 9));
        System.out.println(ab.blackjack(12, 18));
    }
    
    public boolean chimpTrouble(boolean aSmile,boolean bSmile){
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)){
        return true;
        }
        else{
            return false;
        }
        
    }

    public boolean negPos(int num1, int num2, boolean negative){
        if (negative == true){
            return (num1<0 && num2<0);
        }

        
        else if((num1>0 && num2<0) || (num1<0 && num2>0)){
            return true;
        }
        
        else{
            return false;
        } 
    } 

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == true){
            return false;
        }
        else if (isMom == true && isAsleep == false){
            return true;
        }
        else
        {
            return false;
        }
    
    }

    public String setAlarm(int day, boolean vacay){
        if (day>5 && vacay == true){
            return "off";
        }
        else if ((day >5 || day == 0) || ((day<6 && day >0) && vacay == true)){
            return "10:00";
        }
        else if (day <6 && day >0){
            return "7:00";
        }
        else
        {
            return "off";
        }
    }

    public boolean onesDigitSame(int a, int b, int c){
        if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10){
            return true;
        }
        else
        {
            return false;
        }
    }

    public int blackjack(int one, int two){
            if (one>21 && two>21){
                return 0;
            }
            else if (one>21 & two<21){
                return two;
            }
            else if (one<21 & two>21){
                return one;
            }
            else if (one<=two){
                return two;
            }
            else if (one>=two){
                return one;
            }

            return 0;
        }
    }
