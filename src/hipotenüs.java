import java.util.Scanner;

public class hipotenüs {public static void main(String[] args) {
    // değişkenleri belirleme
    int a, b;
    double c;
    // kullanıcıdan verileri toplama
    Scanner girdi = new Scanner(System.in);
    System.out.print("1.Kenarı Giriniz : ");
    a= girdi.nextInt();
    System.out.print("2. Kenarı Giriniz:");
    b= girdi.nextInt();
girdi.close();
    c=Math.sqrt((a*a)+(b*b));
    System.out.println("Hipotenüs:" +c);

}

}
