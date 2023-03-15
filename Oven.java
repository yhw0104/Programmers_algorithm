import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int work = sc.nextInt();

        int min = (h*60) + m + work;

        h = (min/60) % 24;
        m = min%60;

        System.out.println(h + " " + m);
    }
}
