package L17_Interfaces;

public class Main {

    static void main() {
//        Car car = new Car();
//
//        car.start();
//        car.acc();
//        car.brake();
//        car.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.stop();
    }
}
