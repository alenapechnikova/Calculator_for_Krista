import java.util.Scanner;

public class Calculator {
    public static void calculator () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример: ");
        String math = in.nextLine();
        String[] parts = math.split(" ");
int number1 = Integer.parseInt(parts[0]);
int number2 = Integer.parseInt(parts[2]);

    switch(parts[1]) {
        case "*":
            System.out.println( number1 * number2);
            break;
        case "+":
            System.out.println(number1 + number2);
            break;
        case "-":
            System.out.println(number1 - number2);
            break;
        case "/":
            if(Integer.parseInt(parts[2]) != 0) {
                System.out.println(number1 / number2);
            }else{
                System.out.println("На ноль делить нельзя.");
            }
            break;
        default:
            System.out.println("Операция недоступна");
    }
    }
    }


