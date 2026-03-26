// Compare names (case-sensitive & insensitive)

import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        System.out.println("Case Sensitive: " + name1.equals(name2));
        System.out.println("Case Insensitive: " + name1.equalsIgnoreCase(name2));
    }
}
