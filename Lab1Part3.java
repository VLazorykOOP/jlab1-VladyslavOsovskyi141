import java.util.Scanner;

public class Lab1Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (size of matrix, n <= 20): ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter elements of the matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] seq1 = {1, 2, 3, 3, 2, 1};
        int[] seq2 = {1, 2, 3, 5, 3, 2, 1};

        System.out.println("Rows matching symmetric sequences:");

        for (int i = 0; i < n; i++) {
            if (matchesSequence(A[i], seq1) || matchesSequence(A[i], seq2)) {
                System.out.println("Row " + (i + 1));
            }
        }

        sc.close(); 
    }

    static boolean matchesSequence(int[] row, int[] seq) {
        if (row.length != seq.length) return false; // довжина має збігатися
        for (int i = 0; i < seq.length; i++) {
            if (row[i] != seq[i]) return false;
        }
        return true;
    }
}