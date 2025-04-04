import java.util.Scanner;

public class Calculator {

    public int number1;
    public int number2;
    String math = "";
    String operation = "";


    public String input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример: ");
        this.math = in.nextLine();
        return math;
    }

    public void splitAndConvert() {
        String[] parts = math.split(" ");
        number1 = Integer.parseInt(parts[0]);
        number2 = Integer.parseInt(parts[2]);
        operation = parts[1];
    }

    public int result() {
        switch (this.operation) {
            case "*":
                return number1 * number2;
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;

            case "/":
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    System.out.println("На ноль делить нельзя.");
                }
            default:
                System.out.println("Операция недоступна");
        }
        return 0;
    }

    public void output() {
        System.out.println("Ответ: " + result());
    }
}



