import java.util.Scanner;
class Exp1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        System.out.println("Enter the token number:");
        int tokenNo = scanner.nextInt();
        System.out.println("------Details------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Token Number: " + tokenNo);
        scanner.close();
    }
}