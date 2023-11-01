public class Conditionals {
    public static void main(String [] arg){
        Conditionals ab = new Conditionals();
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));

        System.out.println(negPos(1,-1, false));

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
}
