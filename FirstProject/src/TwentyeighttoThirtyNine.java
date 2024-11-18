import java.util.Scanner;

public class TwentyeighttoThirtyNine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = input.nextInt();
        //multiTable(num);
      isPalindrome(num1);

    }
    public static void isPalindrome(int num){
        int val =num;
        int reverse=0;
        while(val!=0){
            reverse = reverse*10 +(val%10);
            val=val/10;
        }
        if(reverse== num) System.out.println("true");
        else System.out.println("false");
    }
    public static void isArmstrong(int num){
        int val =num;
        double sum =0;
        while(val>0){
            int x = val%10;
            sum+=Math.pow(x,3);
           val= val/10;
        }
        if(sum == num) System.out.println("true");
        else System.out.println("False");
    }
    public static void fibonacci(int num){
        int x = 0;
        int y = 1;
        while(x<=num) {
            System.out.print(x + " ");
            int temp = y;
            y = x + y;
            x = temp;
        }
    }
    public static double reverseDigits(int num){
        int n=0;
        double ans=0;
        while(num!=0){
            int x = num%10;
            ans = (ans*10)+ x;
            n+=1;
            num=num/10;
        }
        return ans;
    }
    public static boolean isPrime(int num){
        int n = 2;
        int cnt =1;
        while(n<=num){
            if(num%n ==0){
                cnt++;
            }
            n++;
        }
        return cnt == 2;
    }
    public static int lcm(int num1, int num2){
        int lcmVal;
        lcmVal = (num1* num2)/gcd(num1,num2);
        return lcmVal;
    }
    public static int gcd(int num1, int num2){
        if(num1 ==0){
            return num2;
        }
        return gcd(num2%num1, num1);
    }
    public static int sumOfDigits(int num){
        int val = num;
        int sum =0;
        while(val>0){
            sum+= (val%10);
            val = val/10;
        }
        return sum;
    }
    public static int factorial(int num){
        int ans = 1;
        int val =1;
        while(val<=num){
            ans = ans*val;
            val+=1;
        }
        return ans;
    }
    public static int sumOfOdd(int num){
        int x =1;
        int sum=0;
        while(x<=num){
            sum+=x;
            x+=2;
        }
        return sum;
    }

    public static void multiTable(int num) {
        int x = 1;
        while (x <= 10) {
            System.out.println(num * x);
            x += 1;
        }
    }
}