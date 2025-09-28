public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];                 // main diagonal
            sum += arr[i][n - 1 - i];          // secondary diagonal
        }
        
        // If n is odd, subtract the middle element once (it was counted twice)
        if (n % 2 == 1) {
            sum -= arr[n / 2][n / 2];
        }
        
        System.out.println("The sum of all diagonal elements is " + sum);
    }
}




