public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        int ans = binary_Search(a, target);
        System.out.println(ans);
    }
    static int binary_Search(int a[], int target){
        int start = 0;
        int end = a.length-1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if(target < a[mid]){
                end = mid -1;
            } else if (target > a[mid]) {
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
