public class NestedTriangleLoops {
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

    public static void alternate(int height){
        for (int row = 0; row <= height; row++) {
            System.out.println(" ");
            
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }
        }
    }

    public static void main(String [] args){
        //eights();
        alternate(6);

    }
}

