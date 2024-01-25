public class StringsHarderCSBS {
    public static String switchPairs(String i) {

        int j = 0;
        int k = 1;
        String ans = "";
        while (j <= i.length()) {
        ans = ans + (i.substring(k) + i.substring(j));
        k = k + 2;
        j = j + 2;
        }

        return ans;
        // (0,1) (2,3) (4,5)

}

// switchPairs("example") --> "xemalpe"
// switchPairs("hello there") --> "ehll ohtree"

public static void main(String[] args) {
    switchPairs("example");
}
}



