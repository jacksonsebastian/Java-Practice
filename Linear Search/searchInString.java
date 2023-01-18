public class searchInString{
    public static void main(String args []){
        String name = "arthi";
        char target = 'i';
        int output = searchString(name, target);
        System.out.println(output);
    }
    static int searchString(String name, char target){
        if(name.length() == 0){
            return -1;
        }
        
        for(int i = 0; i<name.length(); i++){
            int character = name.charAt(i);
            if(target == character){
                return i;
            }
        }
        return -1;
    }
}