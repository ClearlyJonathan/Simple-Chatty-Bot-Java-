import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrels, nuts;
        squirrels = scanner.nextInt();
        nuts = scanner.nextInt();

        // Calculate how many nuts each squirrels get
        System.out.println(nuts / squirrels);
    }
}