package OOPs;

class Students {
    //data members or instance variables
    private long id;
    private String name;
    private static String schoolName="ABC School";//created in class area

    //default constructor
    public Students() {
        System.out.println("Default constructor invoked");
    }

    //parameterized constructor
    public Students(long id, String name,String schoolName) {

        //invokes the default constructor
        this();

        this.id = id;
        this.name = name;
        Students.schoolName=schoolName;

        //this.display();
        this.print(this);
    }

    //instance method
    public void display()
    {
        System.out.println("Id :"+this.id+"\n"+"Name :"+this.name +"\n"+Students.schoolName);
    }

    public void print(Students s)
    {
        System.out.println("Id :"+s.id+"\n"+"Name :"+s.name+"\n"+Students.schoolName);
    }

}

public class StaticKeyword {
    public static void main(String[] args) {

        Students student1=new Students(111, "Raman","ABC SCHOOL");
        Students student2=new Students(222, "Anita","ABC SCHOOL");
        student1.print(student1);
        //student1.display();
        //student2.display();

    }
}
