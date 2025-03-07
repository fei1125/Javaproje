import java.util.Scanner;
public class taksimetre {public static void main(String[] args) {
   //değişkenleri tanımla
    int km;
    double perkm =2.20 , taksimetreacilis =10, toplamFiyat;
    // kullanıcıdan verileri al
    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi KM cinsinden giriniz:");
    km=input.nextInt();

    toplamFiyat = km*perkm;
    toplamFiyat +=taksimetreacilis;
    toplamFiyat=(toplamFiyat < 20)? 20 : toplamFiyat;

    System.out.println("Toplam Tutar:"+toplamFiyat);
input.close();



}

}
