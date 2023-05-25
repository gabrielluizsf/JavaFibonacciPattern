package github.com.gabrielluizsf.javafibonaccipattern;

public class FibonacciPattern {

    public static void main(String[] args) {
        int n = 10; // número de elementos da sequência Fibonacci
        drawFibonacciPattern(n);
    }

    public static void drawFibonacciPattern(int n) {
        int[] fibonacci = generateFibonacciSequence(n);

        for (int i = 0; i < n; i++) {
            int num = fibonacci[i];
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int[] generateFibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
