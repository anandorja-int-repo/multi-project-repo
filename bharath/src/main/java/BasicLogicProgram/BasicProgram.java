package BasicLogicProgram;


public class BasicProgram {


    public double floatNumber(float numberA, float numberB) {

        return numberA * numberB;
    }


    public int swapNumber(int a, int b) {

        int temp;
        temp = a;
        a = b;
        b = temp;
        return temp;

    }

    public int addOrEven(int number) {
        int even = 0;
        int odd = 1;
        if (number % 2 == 0) { //
            return even;
        } else {
            return odd;
        }

    }

    public int amongBiggestThreeNumbers(int a, int b, int c) {

        if (a > b && a > c) {   // operators in java bitwise operators and logical operators
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public int lcmOfTwoNumbers(int a, int b) {

        int s = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) // to find GCD
                s = i;
        }
        int lcm = a * b / s;
        return lcm;
    }

    public int gcdorHcfofTwoNumbers(int a, int b) {
        int s = 0;
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a == b) {
            return a;
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0)
                s = i;
        }
        return s;

    }

    public int primeNumbers(int num) {
        int temp;
        for (int x = 1; x <= num; x++) {
            if (x == 0 || x == 1)
                continue;
            temp = 1;
            for (int y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    temp = 0;
                    break;
                }
            }
            if (temp == 1) {
                return temp;
            }
        }

          return 0;

    }

    public boolean leapYear(int year){

        if (year%400==0 || (year%4==0)&& (year%100!=0)) {
            return true;
        }
        return false;
    }

    public boolean armStrongNumber(int num){
        int c =0,a,temp;
        temp = num;
        while (num>0){
            a=num%10;
            num = num /10;
            c= c+(a*a*a);
        }
        if (temp == c) {
            return  true;
        }
        return false;
    }
    public boolean neonNumber(int num){
        int sum=0;
        int square = num * num;
        while(square>0){
            int r=square%10;
          sum+=r;
          square=square/10;
        }
        if(sum == num)
            return  true;
        else {
            return false;
        }

    }

    public boolean vowel(char c){

        if (c =='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'||c =='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'){
            return true;
        }else
            return  false;
    }

    public int factorialNumber(int num){

        int fact =1;
        for (int i= 1;i<=num;i++){
            fact=fact*i;
        }
        return  fact;
    }

    public int fabonacciSeries( int num){
        int n1=0,n2=1,n3,i,count =num;
        for (i=2;i<count;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

        return n1;
    }


}
