import java.util.Scanner;

public class dairealan2 {public static void main(String[] args) {
        //değişkenleri tanımla
        double pi=3.14, r, alan, cevre;
        //kullanıcıdan verileri al
        Scanner girdi=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını cm cinsinden giriniz :");
        r=girdi.nextDouble();

alan=(pi*r*r);
cevre=(2*pi*r);
        System.out.print("Dairenin Alanı(cm²):"+alan );
        System.out.print("Dairenin Çevresi(cm) :"+cevre);
    girdi.close();





    
}

}
