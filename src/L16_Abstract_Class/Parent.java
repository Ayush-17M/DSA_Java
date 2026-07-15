package L16_Abstract_Class;

public abstract class Parent {

    int age;
    public Parent(int age){
        this.age = age;
        System.out.println("age: "+age);
    }

    // abstract method
    abstract void career();
    abstract void partner();
}
