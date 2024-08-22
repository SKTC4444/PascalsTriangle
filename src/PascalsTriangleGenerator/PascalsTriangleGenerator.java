package PascalsTriangleGenerator;

public class PascalsTriangleGenerator {

    // We have a constructor called PascalsTriangleGenerator defined.
    public PascalsTriangleGenerator() {
    }
    /* Made a new method called triPascalValue and made it private because we don't want other classes to use it
    or access this method. This will solve one pascal at a time.
    */
    private int triAnswer(int startExecution, int terminate) {
        // If and else statements for returning each row and the values as well as terminating the program.
        if (terminate==0)
            return 1;
        else if (terminate==startExecution){
            return 1;
        } else {
            return triAnswer(startExecution-1, terminate - 1) +
                    triAnswer(startExecution-1, terminate);
        }
    }

    // Declared a method that uses arrays and computes each row to get integers for the triangle.
    public int[] ComputePascalRow(int rowValue) {
        int triangle[] = new int[rowValue];

        // For loop to get each row's value.
        for (int i = 0; i< rowValue; i++) {
            triangle[i] = triAnswer(rowValue - 1, i);
        }return triangle;
    }


}

