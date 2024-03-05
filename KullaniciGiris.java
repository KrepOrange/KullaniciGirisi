import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        //variable
        String username, passwordTry, passwordNew;
        Scanner infos = new Scanner(System.in);
        int yesNo;

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = infos.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        passwordTry = infos.nextLine();

        if(username.equals("patika") && passwordTry.equals("java123"))
            System.out.println("Giriş başarılı.");
        else {
            System.out.print("Bilgilerinizi hatalı girdiniz. Şifrenizi sıfırlamak ister misiniz? (yes: 1, no: 2)\n$ ");
            yesNo = infos.nextInt();

            switch(yesNo) {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    passwordNew = infos.next();
                    //here '.nextLine()' not working but why?
                    if(passwordNew.equals("java123") || passwordNew.equals(passwordTry))
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. (Yeni şifreniz eski şifreniz veya hatalı girdiğiniz şifre ile aynı olamaz)");
                    else
                        System.out.println("Şifre oluşturuldu.");
                    break;
                case 2:
                    System.out.println("Tekrar giriş yapınız.");
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız! Tekrar giriş yapınız.");
            }
        }
    }
}
