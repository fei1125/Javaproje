import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        String userName, password,newPassword;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Kullanıcı Adı:");
        userName=inp.nextLine();

        System.out.print("Şifreniz:");
        password=inp.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış! Şifrenizi Değiştirmek İstiyorsanız 1'e Basın.");
            int choice = inp.nextInt();
            if(choice==1){
                inp.nextLine();
                System.out.println("Yeni Bir Şifre Giriniz.");
                newPassword=inp.nextLine();
                if(newPassword.equals("java123")){System.out.println("Şifre Oluşturulamadı,Lütfen Farklı Bir Şifre Giriniz. ");}
                else{
                    System.out.println("Şifreniz Başarı İle Oluşturuldu.");
                }
inp.close();
            
            }
            

                
            }




            
        }

        
    }


