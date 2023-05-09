import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int elementAmount = scanner.nextInt();
        int[] numbers = new int[elementAmount];
        for (int i = 0; i < elementAmount; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Calculate max divisible by 4
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 4 == 0) {
                if (numbers[j] > max) {
                    max = numbers[j];
                }
            }
        }
        System.out.println(max);
    }
}