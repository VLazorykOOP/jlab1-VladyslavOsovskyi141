
import java.util.Scanner;
import java.util.Arrays;

public class Lab1Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (size of A, n < 400): ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements of A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter m (size of B, m <= 200): ");
        int m = sc.nextInt();
        int[] B = new int[m];
        System.out.println("Enter elements of B:");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (!contains(B, A[i]) && !contains(C, A[i], k)) {
                C[k++] = A[i];
            }
        }

        for (int i = 0; i < m; i++) {
            if (!contains(A, B[i]) && !contains(C, B[i], k)) {
                C[k++] = B[i];
            }
        }

        int[] result = Arrays.copyOf(C, k); 
        System.out.println("Symmetric difference C: " + Arrays.toString(result));
        sc.close();
    }

    static boolean contains(int[] arr, int x) {
        for (int num : arr) {
            if (num == x) return true;
        }
        return false;
    }

    static boolean contains(int[] arr, int x, int k) {
        for (int i = 0; i < k; i++) {
            if (arr[i] == x) return true;
        }
        return false;
        
    }
}