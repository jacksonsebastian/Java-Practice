// Single inheritance

//Sub class - Parent
public class inheritance extends Arthi  {
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        System.out.println(obj.name);
        System.out.println(obj.age());
    }
}

//super Class - child
// If we dont want to inherit the class means we can declare -final- keywprd for the class 
class Arthi{ 
    String name = "Arthi"; //feild

    public int age(){ // method
       int age = 21;
       return age;
    }
}
