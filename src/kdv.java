import java.util.Scanner;


public class kdv {
    public static void main(String[] args) {
       
        double kdvliTutar, tutar, kdvOranı=0.18, kdvTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
tutar = input.nextDouble();
kdvTutar=tutar*kdvOranı;
kdvliTutar=kdvTutar + tutar;

System.out.println("KDV'siz Tutar:" +tutar);
System.out.println("KDV Oranı:" +kdvOranı);
System.out.println("KDV Tutarı:" +kdvTutar);
System.out.println("KDV'li Tutarı: " +kdvliTutar);
input.close();
}}
