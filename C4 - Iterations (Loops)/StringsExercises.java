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
        
        return num.substring(0).replace('0','1').replace('1','0');
    }
    public static void main(String[] args) {
        // System.out.println(scroll("Hello World"));
        // System.out.println(scroll("happy"));
        // System.out.println(scroll("h"));

        // System.out.println(convertName(" Reubenstein, Lori Renee "));
        // System.out.println(convertName("Biden,Joe"));
        // System.out.println(convertName("the Clown, Bozo"));

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

}
}
