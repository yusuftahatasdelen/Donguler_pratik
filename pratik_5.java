import java.util.Scanner;
public class pratik_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, total=1;
        System.out.print("üssü alınacak ifadeyi giriniz: ");
        n = inp.nextInt();
        System.out.print("üs değerini giriniz: ");
        r = inp.nextInt();
        for ( int i = 1; i <= r; i++){
            total *= n;
        }
        System.out.print(n + " üssü " + r +" = " + total);

    }
}
