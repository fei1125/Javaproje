import java.util.Scanner;
public class üçgenalancevre {public static void main(String[] args) {
    // Değişkenleri belirle
    int a, b;
    double c, tu,u,Alan;
    // Kullanıcıdan verileri toplama
    Scanner girdi= new Scanner(System.in);
    System.out.print("Birinci Kenarı Giriniz:");
    a=girdi.nextInt();
    System.out.print("İkinci Kenarı Giriniz:");
    b=girdi.nextInt();
    System.out.print("Hipotenüsü Giriniz:");
    c=girdi.nextDouble();
girdi.close();
    tu=a+b+c ;
    System.out.println("Üçgenin Çevresi:"+tu);

    u=tu/2;

    Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
    System.out.print("Üçgenin Alanı:"+Alan);



}

}
