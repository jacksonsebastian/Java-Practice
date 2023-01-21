import java.util.Arrays;

public class array
{
    public static void main (String[]args)
    {
        int array[][] = {
                {11, 26, 13, 4, 5}, //row index = 0
                {10, 27, 7, 5}, //row index = 1
                {8, 16,} //row index = 2
        };
        int target = 7;
        int[] ans = search(array, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int array[][], int target){

        for(int row=0; row < array.length; row++){ // 0 < 3
            for(int col =0; col < array[row].length;col++){ // 0 < array[0]
                if(array[row][col] == target){ // array [] [] = 7
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}



