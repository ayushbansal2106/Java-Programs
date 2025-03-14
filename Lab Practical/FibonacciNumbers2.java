public class FibonacciNumbers2 {
    public static void main(String[] args) {
        int a = 0, b = 1, result;
        System.out.println("First 10 Fibonacci numbers:");
        for (int i = 0; i <= 10; i++)
        {
            System.out.printf("%d ",a);
            result = a + b;
            a = b;
            b = result;
        }
    }
}
