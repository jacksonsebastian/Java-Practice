import java.util.Scanner;

public class findMin_user_input {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(findMin(a));
    }
    static int findMin(int a[]){
        int ans = a[0];
        for(int i = 1; i< a.length; i++){
            if(a[i] < ans){
                ans = a[i];
            }
        }
        return ans;
    }
}

