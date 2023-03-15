import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int money = 0;
        int max = 0;

        if(a < b) {
            if (b < c){
                max = c;
            }else {
                max = b;
            }
        }
        if(a > b){
            if(a< c){
                max = c;
            } else{
                max = a;
            }
        }

        if (a == b && b == c) {
            money = 10000 + a * 1000;
        }
        else if (a == b || b == c || a == c) {
            if(a == b){
                money = 1000 + a * 100;
            }
            if(a == c){
                money = 1000 + a * 100;
            }
            if(b == c){
                money = 1000 + b * 100;
            }
        }
        else
            money = max * 100;

        System.out.println(money);
    }
}
