import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        /*TODO: Grid of NxM, N = length and w = width,
                ******
                ******
                ******
                Check if it's possible to break K pieces
         */
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int pieces = scanner.nextInt();
        boolean canGetPieces = false;

        for (int i = 0; i < length; i++) {
            if (((length - i) * width) == pieces) {
                canGetPieces = true;
                System.out.println("YES");
            }
        }
        for (int j = 0; j < width; j++) {
            if (canGetPieces) {
                break;
            }
            if (((width - j) * length) == pieces) {
                canGetPieces = true;
                System.out.println("YES");
            }
        }
        if (!canGetPieces) {
            System.out.println("NO");
        }

    }
}