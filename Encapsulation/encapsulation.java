public class encapsulation {
    public static void main(String[] args) {
        person obj = new person();
        obj.setname("Arthi");
        obj.setRollno(1);
        System.out.println(obj.getname() + " " + obj.getRollno());
    }
}

class person {
    //Access modifier
    private String name;
    private int rollno;

    //Getter


    public int getRollno(){
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getname() {
        return name;
    }

    public void setname(String newName) {
        this.name = newName;
    }
}


