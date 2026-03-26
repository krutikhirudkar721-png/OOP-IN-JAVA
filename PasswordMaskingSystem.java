// Mask password except last 2 characters

import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        String masked = pass.replaceAll(".(?=.{2})", "*");
        System.out.println(masked);
    }
}
