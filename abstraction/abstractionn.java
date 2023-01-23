public class abstractionn{
    public static void main(String[] args){
         dept obj=new dept();
         obj.idcard();
    }
}

abstract class student{
    public abstract void idcard();
    
}

class dept extends student{
    public void idcard(){
        int rollnumber=101;
        String name="Arthi";
        int phone=18032001;
        System.out.println(rollnumber + " " + " " + name + " " + phone);
        
    }
}
