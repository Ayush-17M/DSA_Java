package L19_Exception_Handling;

public class Main {
    static void main() {
        int a = 5;
        int b = 0;
        try {
//            int c = a/b;
//            divide(a, b);
            String name = "Ayush";
            if(name.equals("Ayush")){
                throw new MyException("name is Ayush");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("This will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("please do no divide by zero.");
        }
        return a / b;
    }
}
