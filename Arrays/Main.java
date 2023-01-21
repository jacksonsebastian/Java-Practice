public class Main {
    public static void main(String args[] ){
        Main main = new Main();
//        main.pattern_1();
//        main.array();
//        main.pattern_2();
//        main.pattern_star1();
//        main.pattern_star2();
//        main.pattern_p();
//        main.pattern_star();
//        main.pattern_star3();


//        int a[] = {1,2,3,4,5,15,6,19,7,8};
//        int target = 15;
//        System.out.println(linear_search(a, target));
    }

    private void pattern_star3() {

        for (int row = 1; row <= 5; row++){ //

            for (int col =5; col>=row; col--){
                System.out.print("-");
            }
//            int i = 1;
            for (int col2 = 1; col2<= row; col2++){ //
                System.out.print(row + " ");
//                i++;
            }
            System.out.println();
        }
    }

    private void pattern_star2() {

        for (int row = 4; row >=1; row-- ) {
            int i =1;
            for (int col = 1; col <= row-1; col++) {
                System.out.print("* ");
            }
            // 2

            for(int col2 = row; col2<= 4; col2++){ // col2 = 3 ; 5 <=4; :: 1 N
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }

    private void pattern_star() {
        for (int row = 1; row <= 5; row++){ //
            for (int col = 1; col <= row; col++){ //
                System.out.print(row);
            }
            System.out.println();
        }
    }

    private void pattern_star1() {
        int i = 1;
        for (int row = 4; row >=1; row-- ) {

            for (int col = 1; col <= row-1; col++) {
                System.out.print(" ");
            }
             // 2
            for(int col2 = row; col2<=4; col2++ ){ // col2 = 3 ; 5 <=4; :: 1 N
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }

    static int linear_search(int[] a, int target) {
        if(a.length == 0){
            return -1;
        }
        for (int i = 0; i < a.length; i++){
            int element = a[i];
            if(element == target){
                System.out.print("Element Found at index position ");
                return i;
            }
        }
         return -1;
     }




    private void pattern_p() {
        for (int row = 1; row <=5; row++ ){
            for (int col = 1; col <=4; col++ ){

                if(col == 1 || row == 1 || row ==3){
                    System.out.print("* ");
                }
                if(col == 3 && row == 2){
                    System.out.print("  *");
                }
                else System.out.print("  ");

            }


            System.out.println();
        }
    }



    private void pattern_2() {
        for (int row = 1; row <=5; row++ ){
            for (int col = 1; col <=3; col++ ){
                if(col == 1) {
                    System.out.print("* ");
                }
                if(row == 1 || row ==3 || row == 2){
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }


            System.out.println();
        }
    }

    private void array() {
        String arr[] = {"a","b","c","d","e"};
        System.out.println(arr.length);
    }

    public void  pattern_1(){
        for (int row = 1; row <= 5; row++){
            //block
            for (int col = 1;col<= 5; col++ ){
//                System.out.print("* ");
                if(col == 1 || col ==5){
                        System.out.print(row);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }

}