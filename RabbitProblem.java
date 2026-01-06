// Rabbit population growth problem (Fibonacci sequence)
public class RabbitProblem {

    // Recursive method to calculate number of rabbit pairs after n months
    public static int rabbitPairs(int n) {

        // Base case: Month 1 and 2 have only 1 pair
        if (n == 1 || n == 2) {
            return 1;
        }

        // Recursive case: Sum of previous two months
        return rabbitPairs(n - 1) + rabbitPairs(n - 2);
    }

    public static void main(String[] args) {
        int months = 6;
        System.out.println("Rabbit pairs after " + months + " months: " + rabbitPairs(months));
    }
}
