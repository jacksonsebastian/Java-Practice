import java.util.Arrays;

public class maxIn2dArray {
    public static void main(String[] args) {
        int a[][] = {
                {-1,12,3,4},
                {5,6,7,8,9},
                {11,22,33,44,55},
                {12,21,74}};
        int ans = max(a);
        System.out.println(ans);
    }
    static int max(int a[][]){
        int max = a[0][0];
        for (int row = 0; row < a.length; row++){
            for (int col =0; col<a[row].length;col++){

                if(a[row][col] > max){
                    max = a[row][col];
                }

            }
        }
        return max;
    }
}
