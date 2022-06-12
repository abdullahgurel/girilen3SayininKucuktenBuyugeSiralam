import  java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
        Ödev
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("İlk Sayıyı Giriniz:");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        b = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz:");
        c = input.nextInt();

        if (a<c && a<b && b<c) {
            System.out.println( "Girilen Sayıların Küçükten Büyüğe Sıralanmış Hali : " + "c: " + c + " > " + " b: " + b + " > " + " a: " + a);
        } else if (a>c && b>c && a>b) {
            System.out.println("Girilen Sayıların Küçükten Büyüğe Sıralanmış Hali : " + "a: " + a + " > " + " b: " + b + " > " + " c: " + c);
        } else if (b>a && b>c && a>c) {
            System.out.println("Girilen Sayıların Küçükten Büyüğe Sıralanmış Hali : " + "b: " + b + " > " + " a: " + a + " > " + " c: " + c);
        } else {
            System.out.println("Tekrar Sayı Girişi Yap");
        }



    }
}
