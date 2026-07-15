package L17_Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    //constructure
    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
    public void stop() {
        engine.start();
    }
    public void acc() {
        engine.acc();
    }
    public void startMusic() {
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
