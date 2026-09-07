import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] parts = sc.nextLine().trim().split(" ");
        int[] arr = new int[parts.length];
        sc.close();
        for (int i = 0; i < parts.length; i++)
            arr[i] = Integer.parseInt(parts[i]);

        // Compute and print the alternating sum

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            } else {
                sum -= arr[i];
            }
        }
        System.out.println(sum);

    }
}
