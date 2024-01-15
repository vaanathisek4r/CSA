public class StringsExercises {
    // PROBLEM 1
    public static String scroll(String word) {
        return word.substring(1) + word.charAt(0);
    }

    // PROBLEM 2
    public static String convertName(String name) {
        int i = name.indexOf(",");
        return name.substring(i + 1).trim() + " " + name.substring(0,i).trim();
    }

    // PROBLEM 3
    public static String negative(String num) {
        
        String ans = num.substring(0).replace('0','2');
        ans = ans.substring(0).replace('1','0');
        String ans1 = ans.substring(0).replace('2','1');
        return ans1;
    }

    // PROBLEM 4
    public static String dateString(String date) {
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        return day + "-" + month + "-" + year;
        
    }

    // PROBLEM 5
    public static String dateString2(String date) {
        int i = date.indexOf("/"); // month
        if(i == 1) date = "0" + date;
        String month = date.substring(0, 2);
        int j = date.indexOf("/",3); // day
        if(j == 4) date = date.substring(0,3) + "0" + date.substring(3);
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        return day + "-" + month + "-" + year;
    }

    // PROBLEM 6
    public static boolean startsWith(String s, String prefix) {
        if (prefix.length() > s.length()) return false;
            else if (prefix.equals(s.substring(0,(prefix.length())))) return true;
                else return false;
    }

    // PROBLEM 7
    public static boolean endsWith(String s, String suffix) {
        if (suffix.length() > s.length()) return false;
            else if (suffix.equals(s.substring((s.length() - suffix.length()), s.length()))) {
                return true; }
                    else return false;
    }

    // PROBLEM 8
    public static String removeTag(String string, String tag) {

    }
    
    public static void main(String[] args) {
        // System.out.println("\scroll");
        // System.out.println(scroll("Hello World"));
        // System.out.println(scroll("happy"));
        // System.out.println(scroll("h"));

        // System.out.println("\nconvertName");
        // System.out.println(convertName(" Reubenstein, Lori Renee "));
        // System.out.println(convertName("Biden,Joe"));
        // System.out.println(convertName("the Clown, Bozo"));

        // System.out.println("\nnegative");
        // System.out.println(negative("0010111001"));
        // System.out.println(negative("11111111"));

        // System.out.println("\ndateString");
        // System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        // System.out.println("\ndateString2");
        // System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        // System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        // System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        // System.out.println("4/2/2024 becomes " + dateString2("4/2/2024"));

        // System.out.println("\nstartsWith");
        // System.out.println(startsWith("architecture", "arch"));
        // System.out.println(startsWith("architecture", "a"));
        // System.out.println(startsWith("arch", "architecture"));
        // System.out.println(startsWith("architecture", "rch"));
        // System.out.println(startsWith("architecture", "architecture"));

        // System.out.println("\nendsWith");
        // System.out.println(endsWith("astronomy", "nomy"));
        // System.out.println(endsWith("astronomy", "y"));
        // System.out.println(endsWith("astronomy", "nom"));
        // System.out.println(endsWith("nomy", "astronomy"));
        // System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
 






}
}