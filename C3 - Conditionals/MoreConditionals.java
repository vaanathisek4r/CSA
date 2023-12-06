package U3;
public class MoreConditionals {
    public boolean isLeapYear(int year){
        if ((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))) return true;
        else return false;
}

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1<year2) return true;
        else if (year1==year2 && month1<month2) return true;
        else if (year1==year2 && month1==month2 && day1<day2) return true;
        else return false;
    }

    public int findBestFit(int space, int size1, int size2){
        if (size1+size2<=space) return 3;
        else if (size1==size2) return 1;
        else if (size1<size2){
            if (size1>space || size2>space) return 0;
            else return 2;
        }
        else if (size2<=size1){
            if (size2>space || size1>space) return 0;
            else return 1;
        }
        else return 0;
    }

    public boolean makeBenches(int small, int big, int goal){
        if (small+big*5 >= goal) return true;
        else return false;
    }

    public static void main(String [] arg){
        MoreConditionals ce = new MoreConditionals();
        // leap year
        System.out.println("2000 " + ce.isLeapYear(2000));
        System.out.println("2004 " + ce.isLeapYear(2004));
        System.out.println("2003 " + ce.isLeapYear(2003));
        System.out.println("2100 " + ce.isLeapYear(2100));

        // is sooner
        System.out.println("isSooner");
        System.out.println("1/2/2010 is sooner than 1/2/2011 " + ce.isSooner(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is sooner than 2/2/2010 " + ce.isSooner(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is sooner than 2/2/2010 " + ce.isSooner(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is sooner than 3/2/2010 " + ce.isSooner(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is sooner than 1/2/2010 " + ce.isSooner(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is sooner than 1/2/2010 " + ce.isSooner(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is sooner than 1/3/2011 " + ce.isSooner(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is sooner than 1/2/2010 " + ce.isSooner(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is sooner than 1/2/2010 " + ce.isSooner(4,8,2010, 1,2,2010));

        // Best Fit
        System.out.println("Best Fit");
        System.out.println("Find Best fit 6 2 3 is " + ce.findBestFit(6,2,3));
        System.out.println("Find Best fit 6 4 3 is " + ce.findBestFit(6,4,3));
        System.out.println("Find Best fit 6 3 4 is " + ce.findBestFit(6,3,4));
        System.out.println("Find Best fit 1 2 3 is " + ce.findBestFit(1,2,3));
        System.out.println("Find Best fit 4 6 3 is " + ce.findBestFit(4,6,3));
        System.out.println("Find Best fit 4 3 6 is " + ce.findBestFit(4,3,6));
        System.out.println("Find Best fit 4 3 3 is " + ce.findBestFit(4,3,3));
        System.out.println("Find Best fit 4 4 3 is " + ce.findBestFit(4,4,3));

        // Make Bench
        System.out.println("Make benches 3 1 8 is " + ce.makeBenches(3,1,8));
        System.out.println("Make benches 3 1 9 is " + ce.makeBenches(3,1,9));
        System.out.println("Make benches 11 1 15 is " + ce.makeBenches(11,1,15));
        System.out.println("Make benches 4 2 15 is " + ce.makeBenches(4,2,15));
        System.out.println("Make benches 20 0 20 is " + ce.makeBenches(20,0,20));
        System.out.println("Make benches 3 4 20 is " + ce.makeBenches(3,4,20));
        System.out.println("Make benches 0 6 30 is " + ce.makeBenches(0,6,30));
        System.out.println("Make benches 0 5 30 is " + ce.makeBenches(0,5,30));
        System.out.println("Make benches 2 6 23 is " + ce.makeBenches(2,6,23));
        System.out.println("Make benches 3 2 23 is " + ce.makeBenches(3,2,23));

}
}
