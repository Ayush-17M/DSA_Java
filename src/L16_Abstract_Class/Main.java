package L16_Abstract_Class;

public class Main {
    static void main() {
        Son son = new Son(20);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(21);
        daughter.career();
    }
}
