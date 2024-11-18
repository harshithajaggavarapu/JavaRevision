import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int no = input.nextInt();
        String[] arr = new String[no];
        for(int i=0;i<no;i++){
            arr[i]= input.next();
        }
        StringBuilder s = new StringBuilder();
        for(int i=0;i<no;i++){
            s.append(arr[i]).append(" ");
        }
        System.out.println(s.toString());
    }
}
