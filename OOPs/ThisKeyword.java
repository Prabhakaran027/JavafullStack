package OOPs;

class Student
{
    //data members or instance variables
    long id;
    String name;

    //default constructor
    public Student() {
        System.out.println("Default constructor invoked");
    }

    //parameterized constructor
    public Student(long id, String name) {

        //invokes the default constructor
        this();

        this.id = id;
        this.name = name;

        //this.display();
        this.print(this);
    }

    //instance method
    public void display()
    {
        System.out.println("Id :"+this.id+"\n"+"Name :"+this.name);
    }

    public void print(Student s)
    {
        System.out.println("Id :"+s.id+"\n"+"Name :"+s.name);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {

        Student student1=new Student(111, "Raman");
        Student student2=new Student(222, "Anita");

        student1.display();
        student2.display();


    }

}
