public class HarderArraysCSBS {
    public static String nCopies(int[] a) {
        String new = "";
        while (i <= a.length){
            for(int i = 0; i < a[i]; i++) {
                new += [a[i]];
            }

        }
        
    }


    public static void main(String[] args) {
        System.out.print("nCopies \n");
        int[] a = {3, 5, 0, 2, 2, -7, 0, 4};
        int[] a2 = nCopies(a);
        System.out.println(a2);
    }
}