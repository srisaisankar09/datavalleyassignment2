public class SumDivisibleByFiveAndTwo {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};

        int sum = 0;
        for (int num : values) {
            if (num % 10 == 0) { // Check if the number is divisible by 10
                sum += num;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
}