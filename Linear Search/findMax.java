public class findMax {
    public static void main(String args[]){
        int a[] = {20,35,6,5,3,11,30};
        System.out.println(findMax(a));
    }
    static int findMax(int a[]){
        int ans = a[0]; // 20
        for(int i = 1; i< a.length; i++){ // 7 < 7
            if(a[i] > ans){ // 30 < 3
                ans = a[i]; // 3
            }
        }
        return ans;
    }
}
