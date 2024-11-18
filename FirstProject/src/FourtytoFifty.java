import java.util.Scanner;

public class FourtytoFifty {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the length of the array: ");
//        int n= input.nextInt();
//        System.out.println("Enter the value of the array");
//        int[] arr = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.println("sum of array: "+ sumOfArray(arr));
//        System.out.println("Avg of array: "+ avgOfArray(arr,n));
//        System.out.println("Enter the number for no of occurences cal");
//        int num = input.nextInt();
//        System.out.println("no of occurences of "+ num + ": "+ noOfOccurences(arr, num));
        // max min elements
//        System.out.println("Min of array: "+ minOfArray(arr));
//        System.out.println("Max of array: "+ maxOfArray(arr));
        // is array sorted?
//        System.out.println("Its sorted array " + isSortedArray(arr));
        // deletion of element
//        System.out.println("enter the element that needs to be deleted: ");
//        int no= input.nextInt();
//        System.out.println(" after deletion of element");
//        int[] newArr = arrayAfterElementDeletion(arr,no);
//        for(int i =0;i<newArr.length;i++){
//            System.out.print(newArr[i] +" ");
//        }
        // reverse an array
//        System.out.println("Reversed array: ");
//        int[] revArray = reverseArray(arr);
//        for(int i =0;i<revArray.length;i++){
//            System.out.print(revArray[i] +" ");
//        }
        // check array is palindrome
        //System.out.println("the array is palindrome: " + isPalindrome(arr));
        // merge two sorted arrays
//        System.out.println("enter the no of elements of 2nd array");
//        int n2 = input.nextInt();
//        System.out.println("enter the values of array");
//        int[] arr2 = new int[n2];
//        for(int i =0;i<n2;i++){
//            arr2[i] = input.nextInt();
//        }
//
//        System.out.println("merged array");
//        int[] ans = mergeArray(arr, arr2);
//        for(int i =0;i<n+n2;i++){
//            System.out.print(ans[i]+" ");
//        }
        // search element in 2D array

        System.out.println("enter the rows and columns of the 2D array");
        int row = input.nextInt();
        int cols= input.nextInt();
        int[][] arr2D= new int[row][cols];
        System.out.println("enter the values of the 2d array");
        for(int i = 0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr2D[i][j]= input.nextInt();
            }
        }
//        System.out.println("enter the element that needs to be searched in the array");
//        int searchVal= input.nextInt();
//        System.out.println("the value is present in array: "+ search2DArray(arr2D,searchVal));
        // sum and avg of 2D Array
//        System.out.println("sum is: "+ sumOf2DArray(arr2D));
//        System.out.println("avg is: "+ avgOf2DArray(arr2D));

        // sum of diagonal elements
        System.out.println("sum of diagonal elements: "+ sumOfDiagonals2D(arr2D));
    }
    public static int sumOfDiagonals2D(int[][] arr){
        int n= arr.length;
        int sum =0;
        for(int i=0;i<n;i++) {
            sum += arr[i][i];
            sum+= arr[i][n-i-1];
        }
        if(n%2!=0) sum-= arr[n/2][n/2];
        return sum;
    }

public static double avgOf2DArray(int[][] arr){
    int r= arr.length;
    int c = arr[0].length;
    int sum =sumOf2DArray(arr);
    return (double)sum/(r+c);
}
public static int sumOf2DArray(int[][] arr){
    int r= arr.length;
    int c = arr[0].length;
    int sum =0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            sum+=arr[i][j];
        }
    }
    return sum;
}
public static boolean search2DArray(int[][] arr, int num){
    int r= arr.length;
    int c = arr[0].length;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]== num) return true;
        }
    }
    return false;
}
public static int[] mergeArray(int[] arr1, int[] arr2){
    int n1= arr1.length;
    int n2= arr2.length;
    int[] ans= new int[n1+n2];
    int left =0;
    int right =0;
    int i=0;
    while(left<n1 && right<n2){
        if(arr1[left]<= arr2[right]){
            ans[i]= arr1[left];
            left++;
            i++;
        }else{
            ans[i]= arr2[right];
            i++;
            right++;
        }
    }
    while(left<n1){
        ans[i]= arr1[left];
        left++;
        i++;
    }
    while(right<n2){
        ans[i]= arr2[right];
        right++;
        i++;
    }
    return ans;
}
public static boolean isPalindrome(int[] arr){
    int[] rev = reverseArray(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=rev[i]) return false;
    }
    return true;
}
public static int[] reverseArray(int[] arr){
    int n = arr.length;
    int[] rev = new int[n];
    for (int i = 0; i < n; i++) {
        rev[i] = arr[n - i - 1];
    }
    return rev;
}
public static int[] arrayAfterElementDeletion(int[] arr, int num){
    int n = noOfOccurences(arr,num);
    int[] ans = new int[arr.length-n];
    int i =0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]== num) continue;
        ans[i]= arr[j];
        i++;
    }
    return ans;
}
public static boolean isSortedArray(int[] arr){
    int x = arr[0];
    boolean isInc = true;
    boolean isDec = true;
    for(int i =0;i<arr.length;i++){
        if(arr[i]<x) isInc= false;
        x= arr[i];
    }
    x = arr[0];
    for(int i =0;i<arr.length;i++){
        if(arr[i]>x) isDec= false;
        x= arr[i];
    }
    return (isInc || isDec);
}
public static int maxOfArray(int[] arr){
    int x = arr[0];
    for(int j=1;j<arr.length;j++){
        if(arr[j]> x) x = arr[j];
    }
    return x;
}
public static int minOfArray(int[] arr){
    int x = arr[0];
    for(int j=1;j<arr.length;j++){
        if(arr[j]<x) x=arr[j];
    }
    return x;
}
public static int noOfOccurences(int[] arr, int num){
    int cnt =0;
    for(int j: arr){
        if(arr[j]== num) cnt++;
    }
    return cnt;
}
public static int sumOfArray(int[] arr){
    int sum =0;
    for (int j : arr) {
        sum += j;
    }
    return sum;
}
public static double avgOfArray(int[] arr, int len){
    int sum = sumOfArray(arr);
    return (double)sum/len;
}
}
