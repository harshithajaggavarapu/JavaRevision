import java.sql.SQLOutput;
import java.util.Scanner;

public class FiftyNinetoSixtyNine {
    public static void main(String[] args) {
        FiftyNinetoSixtyNine obj = new FiftyNinetoSixtyNine();
        //obj.passwordScanner();
       // obj.multiplication();
       // obj.isPrime();
       // obj.maxValueInArray();
       // obj.occurencesOfElement();
       // obj.exitBreak();
        //obj.sumOfIntegers();
        //obj.printEvenNo();
//        int val = obj.scanner();
//        System.out.println(obj.fibonicca(val));
        System.out.println("enter the string");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println("It is palindrome: "+ obj.palindromeUsingRec(s));

    }
    boolean palindromeUsingRec(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return palindromeUsingRec(s.substring(1,s.length()-1));
        }
        return false;

    }
    int fibonicca(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonicca(n-1)+fibonicca(n-2);
    }
    void printEvenNo(){
        System.out.println("enter the no till which u want to print even nos");
        int val =scanner();
        for(int i=2;i<=val;i++){
            if(i%2!=0) continue;
            System.out.print(i +" ");
        }
    }
    void sumOfIntegers(){
        int[] val = scannerArray();
        int sum=0;
        for(int j:val){
            if(j<0) continue;
            sum+=j;
        }
        System.out.println("sum: "+ sum);

    }
    void exitBreak(){
        String val;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word");
            val= input.next();
        }while(!val.equalsIgnoreCase("exit"));
        System.out.println("EXITED SUCCESSFULLY");
    }
    void occurencesOfElement(){
        int[] arr =scannerArray();
        System.out.println("enter the no to find the occurrence");
        int val= scanner();
        int cnt=0;
        for(int j: arr){
            if(j==val){
                cnt++;
            }
        }
        System.out.println("No of occurences of "+ val + " is: "+ cnt);
    }
    void maxValueInArray(){
        int[] arr =scannerArray();
        int maxi = arr[0];
        for(int j: arr){
            if(j>maxi){
                maxi = j;
            }
        }
        System.out.println("Max value is: "+ maxi);
    }
    void isPrime(){
        System.out.println("Enter the number");
        int num = scanner();
        int cnt =1;
        for(int i=2;i<num;i++){
            if(num%2==0) {
                cnt++;
                break;
            }
        }
        if(cnt>1){
            System.out.println("The number is not prime");
        }else {
            System.out.println("The number is prime");
        }
    }
    void multiplication(){
        System.out.println("Enter the number");
        int num = scanner();
        for(int i=1;i<=10;i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
     void passwordScanner(){
        String password;
        boolean isValid;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your password minimum length of 8");
            password= input.next();
            isValid= password.length()>=8;
        }while(!isValid);
         System.out.println("successful");
     }
     int scanner(){
         Scanner input = new Scanner(System.in);
         return  input.nextInt();
     }
    int[] scannerArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= input.nextInt();
        System.out.println("enter the nos of array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
