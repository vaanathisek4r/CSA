public class WhileLoops {
    // PROBLEM 1
    public int addOdds(int n){
        int sum = 1;
        int num = 1;
   
        while(num < n){
            num = num + 2;
            sum = sum + num;
        }
        return sum;
    }
   
    // PROBLEM 2
    public int sumDigits(int number){
        int sum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            sum+= lastDigit;
            number = number / 10;
        }
        return sum;
    }


    //PROBLEM 3
    public int howManyYears(double startpop, double endpop){
        int result = 0;
        while (startpop < endpop){
            startpop = (startpop * 0.0113) + startpop;
            result +=1;
        }
        return result;
        }

    //PROBLEM 4
    public void printSum(int n){
        int a = n;
        int result = 0;
        while (result < n){
            result = (result+1);
            a += result;
            System.out.print(result);
            System.out.print(" + ");
        }
        System.out.print(n);
        System.out.print(" = ");
        System.out.print(a);    
    }




        public static void main(String [] args){
        WhileLoops wl = new WhileLoops();
        /*// PROBLEM 1
        System.out.println(wl.addOdds(5));
        System.out.println(wl.addOdds(12));
        System.out.println(wl.addOdds(21));
        //PROBLEM 2
        System.out.println(wl.sumDigits(436));
        System.out.println(wl.sumDigits(1264));
        System.out.println(wl.sumDigits(25));
        //PROBLEM 3
        System.out.println(wl.howManyYears(111.2, 120.0));
        System.out.println(wl.howManyYears(111.2, 150.0));
        System.out.println(wl.howManyYears(111.2, 300.0));*/
        //PROBLEM 4
        System.out.println(wl.printSum(6));
        System.out.println(wl.printSum(8));



    }
}

