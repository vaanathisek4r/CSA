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
        String month = date.substring(0, i);
        String moddate = date.substring(i + 1);
        int j = moddate.indexOf("/"); //day
        String year = moddate.substring(j + 1);
        while (i == 1) {
            month = "0" + month;
        }
        String day = "";
}

    public static void main(String[] args) {
        // System.out.println(scroll("Hello World"));
        // System.out.println(scroll("happy"));
        // System.out.println(scroll("h"));

        // System.out.println(convertName(" Reubenstein, Lori Renee "));
        // System.out.println(convertName("Biden,Joe"));
        // System.out.println(convertName("the Clown, Bozo"));

        // System.out.println(negative("0010111001"));
        // System.out.println(negative("11111111"));

        //System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2024 becomes " + dateString2("4/2/2024"));

}
}