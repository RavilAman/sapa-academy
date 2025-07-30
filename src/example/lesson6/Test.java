package example.lesson6;

import java.util.Scanner;
import java.util.logging.Logger;

public class Test {

  private static Logger logger = Logger.getLogger(Test.class.getName());

  public static void main(String[] args) {

    while (true) {
      logger.info("Start to calculate");
      Scanner scanner = new Scanner(System.in);
      String input1 = scanner.next();
      String input2 = scanner.next();
      String input3 = scanner.next();

      int a = Integer.parseInt(input1);
      String method = input2;
      int b = Integer.parseInt(input3);

      try {
        int sum = calculate(a, method, b);
        System.out.println(input1 + " " + input2 + " " + input3 + " = " + sum);
      } catch (ArithmeticException ex) {
        System.out.println("Ошибка во время исполнения метода calculate " + input1 + " " + input2 + " " + input3 +
          "cause " + ex.getMessage());
      } catch (CustomException ex){
        System.out.println("Ошибка во время исполнения метода calculate кинулась ощибка CustomException cause " + ex.getMessage());
      } finally {
        System.out.println("Good try again!");
      }
    }

  }

  public static int calculate(int a, String method, int b) throws ArithmeticException {
    if (method.equals("+")) {
      return a + b;
    } else if (method.equals("-")) {
      return a - b;
    } else if (method.equals("/")) {
      return a / b;
    } else if (method.equals("*")) {
      return a * b;
    } else {
      throw new CustomException("Illegal operation " + method );
    }
  }
}