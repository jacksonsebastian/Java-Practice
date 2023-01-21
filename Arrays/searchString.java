import java.util.Arrays;
public class searchString {
    public static void main(String[] args) {
        String name = "Arthi";
        char find = 't';
        System.out.println(search(name,find));
    }
    static boolean search(String name, char find){

        if(name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length();i++){
            int letter = name.charAt(i);
            if(find == letter){
                return true;
            }
        }
        return false;
    }
}
