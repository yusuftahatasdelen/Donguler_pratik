import java.util.Scanner;

public class pratik_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("sınır değeri giriniz: ");
        n = input.nextInt();
        for ( int i = 1 ; i < n; i *= 4, i *= 5){
            System.out.println(i);
        }
    }
}
