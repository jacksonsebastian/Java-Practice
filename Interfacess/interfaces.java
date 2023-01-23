package Interfacess;
public class interfaces{
	public static void main(String[] args) {
		student obj = new student();
		obj.name();
		obj.rollno();
		obj.phone();
		obj.address();
		
	}
}

interface register1 {
    public void name();
    public void rollno();
}

interface register2 {
    public void phone();
    public void address();
}

class student implements register1, register2 {
    public void name(){
        String name = "Arthi";
        System.out.println(name);
    }
    
    public void rollno(){
        int rollno = 12;
        System.out.println(rollno);
    }
    
    public void phone(){
        int phoneno = 987612343;
        System.out.println(phoneno);
    }
    
    public void address(){
        String address = "123 Street";
        System.out.println(address);
    }
}








