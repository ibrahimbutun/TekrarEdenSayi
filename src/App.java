import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] dizi = { 81, 77, 3, 4, 59, 6, 57, 81, 9, 1, 2, 81, 24, 57, 64, 77 };

        Arrays.sort(dizi);

        int tekrarEdenSayi = dizi[0];
        int tekrarSayisi = 1;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] == dizi[i - 1]) {
                tekrarSayisi++;
            } else {
                if (tekrarSayisi > 1) {
                    System.out.println(tekrarEdenSayi + " sayısı " + tekrarSayisi + " kere tekrar ediyor.");
                }
                tekrarEdenSayi = dizi[i];
                tekrarSayisi = 1;
            }
        }

        if (tekrarSayisi > 1) {
            System.out.println(tekrarEdenSayi + " sayısı " + tekrarSayisi + " kere tekrar ediyor.");
        }
    }
}
