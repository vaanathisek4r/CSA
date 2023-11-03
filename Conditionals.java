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

        System.out.println(ab.pickUpPhone(false, false, true));
        System.out.println(ab.pickUpPhone(true, true, true));
        System.out.println(ab.pickUpPhone(true, true, false));
        System.out.println(ab.pickUpPhone(false, true, false));
        System.out.println(ab.pickUpPhone(true, false, false));
        System.out.println(ab.pickUpPhone(false, false, false));
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
        if (isMorning == true && isMom == true){
            return true;
        
        else if (isAsleep == true){
            return false;

        else{
            return false;
        }
        }
        }
    }


}
