import java.util.Scanner;
public class notort {
public static void main(String[] args) {
    // Değişkenleri belirle 
    int mat, fizik, kimya, turkce, tarih, muzik;
    // Scanner sınıfını tanımla
    Scanner inp = new Scanner(System.in);
    // Kullanıcıdan değerleri al
    System.out.print("Matematik Notunuz : ");
    mat=inp.nextInt();
    System.out.print("Fizik Notunuz:");
    fizik=inp.nextInt();
    System.out.print("Kimya Notunuz:");
    kimya=inp.nextInt();
    System.out.print("Türkçe Notunuz:");
    turkce=inp.nextInt();
    System.out.print("Tarih Notunuz:");
    tarih=inp.nextInt();
    System.out.print("Müzik Notunuz :");
    muzik=inp.nextInt();
int toplam =(mat + fizik+ kimya + turkce + tarih + muzik);
double sonuc = toplam / 6 ;
System.out.println("Ortalamanız :" +sonuc);
String ogrencidurumu = (sonuc >=60)? "Sınıfı Geçti." : "Sınıfta Kaldı.";
System.out.println(ogrencidurumu);
inp.close();
}
}
