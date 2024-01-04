public class AdvancedForLoops {
    // PROBLEM 1
    public static void eights(){ 
        int num = 8;
        int space = 0;
            
        for(int a = 4; a >= 0; a--){
            for(int b = 0; b < space; b++){
                System.out.print(" ");
            }
            for(int c = 0; c < num; c++){
                System.out.print(num);
            }
            System.out.println();
            num -= 2;
            space += 1;
        }
    }

    // PROBLEM 2
    public static void alternate(int height){
        for (int a = 1; a <= height; a++) {
            for (int b = 1; a % 2 !=0 && b <= a; b++) {
                System.out.print(b);
            }
            for (int c = a; a % 2 ==0 && c > 0; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //PROBLEM 3
    public static void isosceles(int height){
        for (int a = 1; a <= height; a++) {
            for (int b = 0; b < height - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print(c);
            }
            for (int d = a - 1; d > 0; d--) {
                System.out.print(d);
            }
            System.out.println();
        }
    }

    //PROBLEM 4
    public static void upSideDown(int start, int end) {
        for (int a = 0; a <= start - end; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            for (int c = start - a; c >= end; c--) {
                System.out.print(c);
            }
            for (int d = end + 1; d <= start - a; d++) {
                System.out.print(d);
            }
            System.out.println();
        }
    }
    
    public static void main(String [] args){
        eights();
        alternate(6);
        alternate(5);
        isosceles(5);
        isosceles(3);
        upSideDown(9,5);
        upSideDown(8,6);

    }
}


