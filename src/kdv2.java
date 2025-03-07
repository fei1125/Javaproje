import java.util.Scanner;
public class kdv2 {public static void main(String[] args) {
    double kdvliTutar,tutar, kdvOranı, kdvTutar;
    Scanner input=new Scanner(System.in);
    System.out.print("Ücret Tutarını Giriniz:" );
    tutar=input.nextDouble();

    kdvOranı= (tutar<=1000)?0.18 : 0.08;
kdvTutar=tutar*kdvOranı;
kdvliTutar= tutar+kdvTutar;
System.out.println("KDV'siz Tutar:"+tutar);
System.out.println("KDV Oranı:"+(kdvOranı*100)+"%");
System.out.println("KDV Tutarı:"+kdvTutar);
System.out.println("KDV'li Tutar:" +kdvliTutar);
input.close();

}

}
