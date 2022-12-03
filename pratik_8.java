import java.util.Scanner;
public class pratik_8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Adeti Giriniz : ");
        int n=inp.nextInt();

        int i ;
        for (i=1;i<=n;i++){
            for(int b=1;b<=n-i;b++){
                System.out.print(" ");
            }
            for(int c=1;c<=(2*i)-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1;i<n;i++){
            for(int d=1;d<=i;d++){
                System.out.print(" ");
            }
            for(int e=1;e<=((n*2)-1)-(i*2);e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
