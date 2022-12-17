import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        x = input.nextInt();

        for (int i = 1; i <= x; i *= 4) {
            System.out.println(i);
        }
        for (int k = 1; k <= x; k *= 5) {
            System.out.println(k);
        }
    }
}
