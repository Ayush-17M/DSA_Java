package L16_Abstract_Class;

public class Daughter extends Parent{
    //constructure
    Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am going to be a Doctor");
    }
    @Override
    void partner(){
        System.out.println("I love Iron Man.");
    }
}
