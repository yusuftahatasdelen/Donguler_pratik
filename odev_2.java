import java.util.Scanner;
public class odev_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, n, result = 0;
        System.out.print("Bir sayı giriniz: ");
        n = inp.nextInt();
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        if (result == n) {
            System.out.print("MÜQ.");
        } else {
            System.out.print("MÜQ DEĞİL.");
        }
    }
}
