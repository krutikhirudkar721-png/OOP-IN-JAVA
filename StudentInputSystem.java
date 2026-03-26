// Handle invalid input using multiple catch blocks

import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            System.out.println("Student age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }
}
