import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String[] words = new String[4];
        for (int i = 0; i < 4; i++) {
            words[i] = scanner.next();
        }

        for(String word:words){
            System.out.println(word);
        }
    }
}