package L21_String;

public class StudentToString {
    String name;
    int age;
    int rollNumber;
    String home;

    public StudentToString(String name, int age, int rollNumber, String home){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.home = home;
    }
    @Override
    public String toString(){
        return "Student Details: {name:"+name
                +", age:"+age
                +", roll number:"+rollNumber
                +", home:"+home+"}";
    }

    static void main() {
        StudentToString stu = new StudentToString("Ayush",19,6,"Home");
        System.out.println(stu.toString());
    }
}
