import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (array[i] == v) {
                ++count;
            }
        }

        System.out.println(count);

    }
}
