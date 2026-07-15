package L15_OOPs.Polmorphism;

public class Circle extends Shapes {

    // this will run when obj of Circle is created
    // Hence it is overriding the parent method
    @Override // this is called annotation
    void area(){
        System.out.println("I am circle are:- Pi * r * r");
    }
}
