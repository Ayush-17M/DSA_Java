package L36_OOPs.Inheritance;

public class Main {
    static void main() {
        Box box1 = new Box(4);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Box box2 = new Box(4.3, 5.7, 2.9);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,5,8);
        System.out.println(box3.w);

        // Box --> Prent and BoxWeight --> child : (It is valid)
        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);

        // there are many variables in both parent and child classes.
        // you are given access to variable that are in the ref type i.e. BoxWeight.
        // hence, you should have access to weight variable
        // this also means, that the once you are typing to access should be initialised.
        // but here, when the obj itself is of type parent class, how will you call the constructure of child class.

        // BoxWeight --> child and Box --> parent.
        // parent class has no idea of child class.
        // you can't do child reference variable and parent object.
        // this is why error come.

//        BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6.h);

        BoxPrice box = new BoxPrice(5, 8, 200);
    }
}
