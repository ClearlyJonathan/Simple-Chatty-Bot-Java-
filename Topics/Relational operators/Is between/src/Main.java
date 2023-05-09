import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstN = scanner.nextInt();
        int secondN = scanner.nextInt();
        int thirdN = scanner.nextInt();

        if (firstN >= secondN && firstN <= thirdN){
            System.out.println(true);
        }
        else if (firstN <= secondN && firstN >= thirdN){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}