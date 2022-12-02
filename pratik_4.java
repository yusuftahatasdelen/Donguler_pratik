import java.util.Scanner;
public class pratik_4 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int n, r, fakn = 1, fakr = 1, total, fakb = 1;
        System.out.print("kombinasyonu hesaplanacak sayıyı giriniz:");
        n = inp.nextInt();
        System.out.print("Kaçlı kombinasyonu olacağını belirtiniz:");
        r = inp.nextInt();

        for (int i =1; i <=n ; i++){
            fakn = fakn * i;
        }
        for (int a = 1; a <= r; a++){
            fakr = fakr * a ;
        }
        for (int b = 1; b <= (n-r); b ++){
            fakb = fakb * b;
        }
        total = fakn / (fakr * (fakb));
        System.out.print(n+ "'in" + r+"'li kombinasyonu : "+ total);
    }
}
