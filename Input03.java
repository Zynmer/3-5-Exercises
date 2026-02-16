import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner

        Scanner scantron = new Scanner(System.in);
        
        //Find and print the sum of three integers entered by the user
        
        System.out.println("Enter three integers separated by a single space: ");
        int userInt1 = scantron.nextInt();
        int userInt2 = scantron.nextInt();
        int userInt3 = scantron.nextInt();

        System.out.printf("Sum of the integers entered: %d%n", userInt1 + userInt2 + userInt3);
        
        
        //Remember to close the Scanner
        scantron.close();
    }
}
