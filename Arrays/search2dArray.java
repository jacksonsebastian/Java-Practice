import java.util.Arrays;

public class search2dArray {
    public static void main(String[] args) {
        int a[][] = {
                {-1,2,3,4},
                {5,6,7,8,9},
                {11,22,33,44,55},
                {12,21,34}};
        int target = -1;
        int[] ans = search2d(a,target);
        System.out.println(ans);
    }
    static int[] search2d(int a[][], int target){
        for (int row = 0; row < a.length; row++){
            for (int col =0; col<a[row].length;col++){
                if(target == a[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
