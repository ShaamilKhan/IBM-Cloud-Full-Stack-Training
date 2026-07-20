import java.util.Scanner;
 
public class partition {
    public static void printPartitions(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = Math.min(max, n); i >= 1; i--) {
            printPartitions(n - i, i, prefix + (prefix.isEmpty() ? "" : "+") + i);
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Partitions of " + n + ":");
        printPartitions(n, n, "");
        sc.close();
    }
}