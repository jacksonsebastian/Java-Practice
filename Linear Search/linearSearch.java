public class linearSearch{
    public static void main(String args[]){
        //          1, 2, 3, 4, 5, 6, 7
        int a[] = {20,25,17,18,29,30,56};
        //          0, 1, 2, 3, 4, 5, 6 
        int target = 18;
        int output = linearSearch(a, target);
        System.out.println(output);
        
    }
    static int linearSearch(int a[], int target){
        if(a.length == 0){
            return -1;
        }
        for(int i = 0; i < a.length; i++){ // 7 < 7 => false
            int element = a[i]; // 6 => 56
            if(target == element){ // 2 == 56
                return i;
            }
        }
        return -1;
    }
}