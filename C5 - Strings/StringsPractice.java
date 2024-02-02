public class StringsPractice {
    // PRACTICE 1
    public void printBackward(String i) {
        int j = i.length();
        if (j == 0) return;
        for (int k = j - 1; k >= 0; k--) {
            System.out.print(i.charAt(k));
        }
    }

    // PRACTICE 2
    public boolean isPalindrome(String str) {
        String fw = str.toLowerCase();
        String bw = "";
        int j = str.length();
        for (int k = j - 1; k >= 0; k--) {
            bw += str.charAt(k);
        }
        bw = bw.toLowerCase();
        if (fw.equals(bw)) return true;
        else return false;
    }

    // PRACTICE 3
    //public 


    public static void main(String[] args) {
        StringsPractice cs = new StringsPractice();
        System.out.println("\nprintBackward");
        cs.printBackward("hello there!");
        System.out.println();
        System.out.println("\nisPalindrome");
        System.out.println(cs.isPalindrome("Vaanathi"));
        System.out.println(cs.isPalindrome("Racecar"));
}
}