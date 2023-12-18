public class ForLoops {
    // PROBLEM 1
    public int addEvens(int n){
        int sum = 0;
        for(int i = 0; i <= n; i += 2){
            sum += i;
        }
        return sum;
    }
    // PROBLEM 2
    public void printSquaresBack(int n){
        int product = n;
        for(int i = n; i > 0; i--){
            product = i * i;
            System.out.print(product + " ");
        }
    }

    // public void sillyNumbers(){
    //     int a = 0;
    //     for(int a = 0; a < 4; a++){
    //         for(int b = 1; b < 5; b++){
    //             for(int c = 2; c < 6; c++){
    //             }
    //         }
    //         System.out.print(a);
    //     }
    // }

    public void sillyNumbers(){
        for(int a = 0; a++){
            
        }
    }
    


    public static void main(String [] args){
        ForLoops fl = new ForLoops();
        //PROBLEM 1
        // System.out.println(fl.addEvens(5));
        // System.out.println(fl.addEvens(7));
        // System.out.println(fl.addEvens(12));
        // fl.printSquaresBack(8);
        fl.sillyNumbers();

    }

}