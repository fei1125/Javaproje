import java.util.Scanner;
public class dairealan {public static void main(String[] args) {
   //değişkenleri tanımla
    double pi=3.14,alan;
    int r, a;
   //kullanıcıdan verileri al
   Scanner girdi=new Scanner(System.in);
   System.out.print("Dairenin yarı çapını CM cinsinden girdiniz:");
   r=girdi.nextInt();
   System.out.print("Dairenin merkez açısının ölçüsünü giriniz:");
   a=girdi.nextInt();
    
   alan=(pi*(r*r)*a)/360;
   System.out.println("Dairenin alanı(cm²)"+alan);
girdi.close();


    
}

}
