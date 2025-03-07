import java.util.Scanner;

public class manavprog {public static void main(String[] args) {
    //değişkenleri tanımlayalım
    double a=2.14,e=3.67,d=1.11,m=0.95,p=5,t,kga,kge,kgd,kgm,kgp;
    double armut,elma,domates,muz,patlican;
    //kullanıcıdan verileri toplama
    Scanner girdi= new Scanner(System.in);
    System.out.print("Armut(kg):");
    kga=girdi.nextDouble();
    System.out.print("Elma(kg):");
    kge=girdi.nextDouble();
    System.out.print("Domates(kg):");
    kgd=girdi.nextDouble();
    System.out.print("Muz(kg):");
    kgm=girdi.nextDouble();
    System.out.print("Patlıcan(kg):");
    kgp=girdi.nextDouble();

armut=a*kga;
elma=e*kge;
domates=d*kgd;
muz=m*kgm;
patlican=p*kgp;

t=(armut+elma+domates+muz+patlican);
    System.out.println("Toplam Tutar (TL):"+t);
    girdi.close();






    
}

}
