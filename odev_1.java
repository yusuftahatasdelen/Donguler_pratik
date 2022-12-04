import java.util.Scanner;
public class odev_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, n, sayi;
        int max = 1, min = 0 ;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        while (i <= n) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi > max) {
                    max = sayi;
                }else if (sayi < min) {
                    min = sayi;
                }
            i++;
        }
        System.out.println("En büyük değer :" + max);
        System.out.println("En küçük değer :" + min);
    }
}
