import  java.util.Scanner;
public class pratik_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        int n;
        double result =0;
        n =input.nextInt();
        for (double i =1; i <= n; i++){
            result += 1 / i;
        }
        System.out.print(result);
    }
}
