import  java.util.Scanner;

public class pratik_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, toplam = 0, ortalama = 0, bolme = 0;
        System.out.print("sınır değeri giriniz: ");
        k = input.nextInt();
        for (int i = 1; i < k; i++){
            if((i % 3 ==0) && (i % 4 == 0)){
                System.out.println(i);
             toplam = toplam+i;
             bolme++;
             ortalama = toplam / bolme;
            }

        } System.out.print("Sayıların Ortalaması : " + ortalama);

    }
}
