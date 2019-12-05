import java.util.Scanner;

class ExA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt1 = scanner.nextInt();
        int inputInt2 = scanner.nextInt();
        int inputInt3 = scanner.nextInt();
        String inputString = scanner.next();
        scanner.close();

        System.out.println((inputInt1 + inputInt2 + inputInt3) + " " + inputString);
    }
}