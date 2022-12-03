import java.util.Scanner;
public class pratik_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi ;
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        int b , result = 0;

        while ( sayi != 0){
            b = sayi % 10;
           result += b;
            sayi /= 10;

        }
        System.out.println(result);

    }
}
