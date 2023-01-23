package folder;

class interfaces{
	public static void main(String[] args) {
		student obj = new student();
		obj.name();
		obj.rollno();
	}
}

interface register {
    public void name();
    public void rollno();
}

class student implements register {
    public void name(){
        String name = "Jackson";
        System.out.println(name);
    }
    
    public void rollno(){
        int rollno = 12;
        System.out.println(rollno);
    }
}
