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

    // PROBLEM 3
    public static void sillyNumbers(){
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c < 3; c++){
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }

    // PROBLEM 4
    public static void sillyNumbers2(){
        for(int a = 0; a < 4; a++){
            for(int b = 9; b >= 1; b--){
                for(int c = 0; c < b; c++){
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }

    public static void dollarsAndStars(){
        for(int a = 0; a < 7; a++){
            for(int b = 0; b < a; b++){
                System.out.print("$");
            }
            for(int c = 0; c < 2 * (7 - a); c++){
                System.out.print("*");
            }
            for(int d = 0; d < a; d++){
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        ForLoops fl = new ForLoops();
        // PROBLEM 1
        System.out.println(fl.addEvens(5));
        System.out.println(fl.addEvens(7));
        System.out.println(fl.addEvens(12));
        // PROBLEM 2
        fl.printSquaresBack(8);
        fl.printSquaresBack(10);
        fl.printSquaresBack(20);
        // PROBLEM 3
        ForLoops.sillyNumbers();
        // PROBLEM 4
        sillyNumbers2();
        // PROBLEM 5
        dollarsAndStars();
    }

}