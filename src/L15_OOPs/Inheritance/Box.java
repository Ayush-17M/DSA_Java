package L15_OOPs.Inheritance;

public class Box {
    double l;
    double h;
    double w;

     //constructure
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        super();

        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //copy constructure
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
