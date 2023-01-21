public class swapping {
    public static void main (String [] args){
        int a = 10;
        int b = 20;
//        before swapping
        System.out.println(a);
        System.out.println(b);

//        After swapping
        System.out.println();
//        Using Third variable

//        int c = a; // c = 10
//        a = b; // a = 20
//        b = c; // b = 10

        a= a+b; // 10 * 20 = 200
        b= a-b; // 200 / 20 = 10 // b = 10
        a = a-b; // 200 / 10 = 20 // a = 20
        System.out.println(a);
        System.out.println(b);


    }
}
