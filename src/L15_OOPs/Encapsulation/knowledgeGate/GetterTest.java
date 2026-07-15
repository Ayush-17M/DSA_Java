package L15_OOPs.Encapsulation.knowledgeGate;

import L15_OOPs.Encapsulation.gatterSetter.Car;

public class GetterTest {
    static void main() {
        Car car = new Car("Red","Mauruti",
                3,8000);
        System.out.println(car);
        System.out.printf("%s %s \n",car.getColor(),car.getModel());
//        car.getColor();
        car.setColor("Pink");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}
