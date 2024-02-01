public class StringsHarderCSBS {
    // PROBLEM 1
    public String switchPairs(String str) {
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < str.length() - 1; i += 2) {
            sb.append(str.charAt(i + 1));
            sb.append(str.charAt(i));
        }
    
       
        if (str.length() % 2 != 0) {
            sb.append(str.charAt(str.length() - 1));
        }
    
        return sb.toString();
    }

    // PROBLEM 2
    public String removeDuplicates(String str) {
        String result = "";
        String lastChar = "";
        
        for (int i = 0; i < str.length(); i++) {
            String currentChar = str.substring(i, i + 1);
            if (i == 0 || !currentChar.equals(lastChar)) {
                result += currentChar;
                lastChar = currentChar;
            }
        }
        return result;
    }

    // PROBLEM 3
    public boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
    
        String doubleStr1 = str1 + str1;
        return doubleStr1.contains(str2);
    }

    // PROBLEM 4
    public String addCommas(String s) {
        int x = s.length();
        String s1 = "";
        if (s.length() <= 3) {
            return s;
        }
        if (x % 3 > 0) {
            s1 += s.substring(0, x % 3) + ",";
        }
        for (int i = x % 3; i < x; i += 3) {
            if (i + 3 > x-3) {
                s1 += s.substring(i, i + 3);
            }
        else s1 += s.substring(i, i + 3) + ",";
        }
        return s1;
    }

    // PROBLEM 5
    public String rowColumnConvert(String str, int rows) {
        if (rows <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < length; j += rows) {
                sb.append(str.charAt(j));
            }
        }
        return sb.toString();
    }

    // PROBLEM 6
    public void nameDiamond(String name) {
        int length = name.length();
        for (int i = 0; i < length; i++) {
            System.out.println(name.substring(0, i + 1));
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(name.substring(i));
        }
    }

public static void main(String[] args) {
    StringsHarderCSBS csbs = new StringsHarderCSBS();
    System.out.println("\nswitchPairs");
    System.out.println(csbs.switchPairs("example"));
    System.out.println(csbs.switchPairs("hello there"));

    System.out.println("\nremoveDuplicates");
    System.out.println(csbs.removeDuplicates("bookkeeeeeper"));
}
}