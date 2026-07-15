package L15_OOPs.Inheritance;
// Single inheritance.
// BoxWeight -> child inherit Box -> parent

public class BoxWeight extends Box {
    double weight = -1;

    BoxWeight() {
        this.weight = -1;
    }

    //copy constructure
    BoxWeight(BoxWeight other){
        super(other);
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);  //what is this? call the parent class constructor
        this.weight = weight;
    }

}
