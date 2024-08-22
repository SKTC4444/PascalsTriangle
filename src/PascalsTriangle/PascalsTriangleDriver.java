
package PascalsTriangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PascalsTriangleDriver {

    private static String goodbye = "Adiós!";

    public static void main(String args[]) {
        int rowNum = getRowNum();

        while (rowNum >= 0) {
            PascalsTriangleGenerator.PascalsTriangleGenerator p = new PascalsTriangleGenerator.PascalsTriangleGenerator();
            int[] row = p.ComputePascalRow(rowNum + 1);

            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
            rowNum = getRowNum();
        }
        System.out.println(goodbye);
    }

    private static int getRowNum() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row of Pascal's Triangle: ");
        int rowNum = -1;
        try {
            rowNum = input.nextInt();
            input.nextLine();
        } catch (InputMismatchException e) {
            System.err.println(goodbye);
            System.exit(1);
        } finally {
            // System.out.println("InputMismatchException handled.");
        }
        return rowNum;
    }
}