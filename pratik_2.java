import java.util.Scanner;

public class pratik_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, total = 0;

        do {
            System.out.print("Bir Sayı Giriniz: ");
            sayi = inp.nextInt();
            if (sayi % 4 == 0){
                total += sayi;
            }
        } while (sayi % 2 == 0);
        System.out.print("4ün katı olan sayıların toplamı : " + total);
    }
}
