package L16_Abstract_Class;

public class Son extends Parent{
    //constructure
    Son(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I am going to be a coder");
    }
    @Override
    void partner(){
        System.out.println("I Like Khushi Ma'am.");
    }
}
