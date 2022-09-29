/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        int sayi, ikinciSayi;
        System.out.println("Sayi girin: ");
        System.out.println("Sinir degerini gir: ");
        sayi = yazici.nextInt();
        for (int i = 4; i <=sayi ; i*=4) {
            System.out.println("4'un kati: "+i);

        }
        for (int i = 5; i <=sayi ; i*=5) {
            System.out.println("5'un kati: "+i);

        }



    }
}
