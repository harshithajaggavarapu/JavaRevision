import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        double no = Math.floor(Math.random()*10);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 to 10");
        double n = input.nextDouble();
        boolean guess= n==no;
        System.out.println("The guess is " + guess);
    }
}
