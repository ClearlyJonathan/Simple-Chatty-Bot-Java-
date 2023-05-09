import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        /* 3 Groups, in each desk 2 students.
        Inputs = Number of students in each group
        Get how many tables we need
         */
        int[] groups = new int[3];
        int tablesNeeded = 0;

        for (int i = 0; i < groups.length; i++){
            groups[i] = scanner.nextInt();
        }
        for(int group: groups){

            if ((group % 2) != 0){
                tablesNeeded += group / 2 + group % 2;
            }
            else{
                tablesNeeded += group / 2;
            }
        }

        System.out.println(tablesNeeded);
    }
}