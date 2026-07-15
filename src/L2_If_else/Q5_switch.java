package L2_If_else;
import java.util.Scanner;

public class Q5_switch {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        String fruit = input.next().toLowerCase();

//        switch(fruit){
//            case "mango":
//                System.out.println("King of fruits.");
//                break;
//            case "apple":
//                System.out.println("A sweet red fruits");
//                break;
//            case "orange":
//                System.out.println("Round fruit");
//                break;
//            case "grapes":
//                System.out.println("Small fruit");
//                break;
//            default :
//                System.out.println("Please enter a valid fruit!");

        switch(fruit){
            case "mango" -> System.out.println("King of fruits.");
            case "apple" -> System.out.println("A sweet red fruits");
            case "orange" -> System.out.println("Round fruits");
            case "grapes" -> System.out.println("A small fruits");
            default -> System.out.println("please enter a valid gruit name!");

        }
    }
}
