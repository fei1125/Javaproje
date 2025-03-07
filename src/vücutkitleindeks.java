import java.util.Scanner;

public class vücutkitleindeks {public static void main(String[] args) {
    //değişkenleri tanımlama
    double kg, boy,indeks;
    //kullanıcıdan verileri alma
    Scanner girdi= new Scanner(System.in);
    System.out.print("Kilonuzu giriniz :");
    kg=girdi.nextDouble();
    System.out.print("Boyunuzu M cinsinden giriniz :");
    boy=girdi.nextDouble();


    indeks=(kg/(boy*boy));
    System.out.print("Vücut Kitle İndeksiniz:"+indeks);
    girdi.close();
}
}
