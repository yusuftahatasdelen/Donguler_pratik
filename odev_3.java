import java.util.Scanner;
public class odev_3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Adeti Giriniz : ");
        int n=inp.nextInt();

        for (int i=0;i<=n;i++) {
            for (int d = 0; d <= i; d++) {
                System.out.print(" ");
            }
            for (int e = 1; e <= ((n * 2) - 1) - (i * 2); e++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
