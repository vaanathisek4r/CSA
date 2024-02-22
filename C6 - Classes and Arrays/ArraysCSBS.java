public class ArraysCSBS {

    public static int maxValue(int[] nums) {
        int i = 0;
        int max = nums[i];
        for (i = 0; i < nums.length-1; i++) {
            if (max < nums[i + 1]) {
                max = nums[i + 1];
            }
        }
        return max;
    }

    public static double computeAverage(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / (a.length);
    }
    
    public static double getPercentEven(int[] num) {
        double sum = 0.0;
        for(int i = 0; i < num.length; i++) {
        if (num[i] % 2 == 0) {
            sum += 1;
        }
        }
        if (num.length == 0) return 0.0;
        else return sum / (num.length) * 100;
    }

    // public static String switchPairs(String[] b) {
    //     String ans = "";
    //     for (int length = 0; length < b.length; length += 2) {
    //         if (length + 1 < b.length) {
    //             ans += b[length + 1] + b[length];
    //         } else {
    //             ans += b[length];
    //         }
    //     }
    //     return ans;
    // }

    public static String switchPairs(String[] x) {
        String holder = " ";
        if (x.length % 2 != 0) {
            holder = x[x.length - 1];
            x[x.length - 1] = null;
        }
        for (int i = 0; i < x.length - 1; i += 2) {
            String temp = x[i];
            x[i] = x[i + 1];
            x[i + 1] = temp;
        }
        if (!holder.equals(" ")) {
            x[x.length - 1] = holder;
        }
        return holder;
    }

    public static boolean sorted(double[] y) {
        for (int i = 0; i < y.length - 1; i++) {
            if (y[i] > y[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("maxValue \n");
        int[] nums = {17, 7, -1, 26, 3, 9};
        System.out.println(maxValue(nums));

        System.out.print("computeAverage \n");
        int[] a = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(computeAverage(a));

        System.out.print("getPercentEven \n");
        int[] num = {6, 2, 9, 11, 3};
        System.out.println(getPercentEven(num));

        System.out.print("switchPairs \n");
        String[] b = {"a", "bb", "c", "ddd", "ee", "f", "g"};
        System.out.println(switchPairs(b));

        System.out.print("sorted \n");
        double[] y = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(sorted(y));
}
}