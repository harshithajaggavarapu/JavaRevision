import java.util.Scanner;

public class FiftyThreetoFiftyEight {
    public static void main(String[] args) {
        //min of two no's

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1= input.nextInt();
       int num2 = input.nextInt();
        System.out.println("Enter the operation no to be performed 1: addition, 2: sub, 3: multi, 4: div");
        int calci = input.nextInt();
//
//        int mini = num1<num2? num1: num2;
//        System.out.println("minimum is: "+ mini);
        // even or odd
//        boolean isEven = num1%2==0 ? true: false;
//        System.out.println("The given no is even: "+ isEven);
        // absolute value of integer
//        int numb = num1<0? -1*num1: num1;
//        System.out.println("Absolute value is : "+ numb);
        // student score categorization
//        String category = num1>80? "High": (num1>50 ? "Moderate": "Low");
//        System.out.println("The student score is "+ category);

//        String month = switch(num1){
//            case 1-> "Jan";
//            case 2-> "Feb";
//            case 3-> "Mar";
//            case 4-> "Apr";
//            case 5-> "May";
//            case 6-> "Jun";
//            case 7-> "Jul";
//            case 8-> "Aug";
//            case 9-> "Sep";
//            case 10-> "Oct";
//            case 11-> "Nov";
//            case 12-> "Dec";
//            default -> "Invalid";
//        };
//        System.out.println(month);

        int ans = switch(calci){
            case 1-> num1+num2;
            case 2-> num1-num2;
            case 3-> num1*num2;
            case 4-> num1/num2;
            default -> 0;
        };
        System.out.println(ans);
    }
}
