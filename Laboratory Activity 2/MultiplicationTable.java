import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the maximum number for the multiplication table: ");
        int maxNumber = scanner.nextInt();

        int[][] multiplicationTable = new int[maxNumber + 1][maxNumber + 1];

        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                multiplicationTable[i][j] = i * j; 
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]); 
            }
            System.out.println(); 
        }

        scanner.close(); 
    }
}

