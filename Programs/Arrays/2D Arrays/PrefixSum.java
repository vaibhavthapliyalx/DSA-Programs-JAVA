/* 
Question: Given a matrix 'a' of dimension n x m and 2 coordinates (l1,r2) and (l2,r2).
Return the sum of the rectangle from (l1,r1) to (l2,r2).
*/

import java.util.*;
class PrefixSum 
{
    static int rows;
    static int columns;
    static int[][] matrix;
    static int l1;
    static int l2;
    static int r1;
    static int r2;

    // Constructor
    PrefixSum() {
        // Initializing matrix to prevent from being null.
        matrix = new int[rows][columns];

        // Setting Matrix before printing onScreen.
        SetMatrix(rows, columns);
    }

    // This is the first method through which we can calculate the sum
    Double CalculateSumThroughTraversal(int l1, int l2, int r1, int r2)
    {
        double sum =0;
        // Total number of rows to be traversed.
        // int rows = l2 - l1 +1; 
        for (int i=l1; i<=l2; i++) {
            for (int j=r1; j<=r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    void SetMatrix(int n, int m) {
        rows = n;
        columns = m;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = 1;
                
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to Prefix Sum Program Using JAVA *****");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter number of rows");
            rows = sc.nextInt();
            System.out.println("Please enter number of columns");
            columns = sc.nextInt();
            System.out.println("Please enter l1");
            l1 = sc.nextInt();
            System.out.println("Please enter r1");
            r1 = sc.nextInt();
            System.out.println("Please enter l2");
            l2 = sc.nextInt();
            System.out.println("Please enter r2");
            r2 = sc.nextInt();
        }
        // Creating an object --> Calls the constructor and initializes matrix and set it.
        PrefixSum Obj = new PrefixSum();

        // Displaying the matrix.
        System.out.println("The matrix is as shown below");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(PrefixSum.matrix[i][j] + " "); 
            }
            System.out.println();
        }
        
        // Calling the sum calculator function : Method 1
        double sum = Obj.CalculateSumThroughTraversal(l1, l2, r1, r2);
        
        System.out.println("The sum of rectangle is = " + (int)sum);
    }
}