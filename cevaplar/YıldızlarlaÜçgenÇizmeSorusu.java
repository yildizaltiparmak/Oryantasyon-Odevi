package yıldızlarla.üçgen.çizme.sorusu;
import java.util.Scanner;
public class YıldızlarlaÜçgenÇizmeSorusu {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen üçgenin yükseklik değeri olarak bir tam sayı giriniz");
        int yukseklik = klavye.nextInt();
        String yaz = "";
        int i = 1;
        while(yukseklik>0){
            String bosluk = "";
            String yildiz = "";
            int p = i;
            while (p>0){
                yildiz = yildiz+"*";
                p = p-1;
            }
            int q = yukseklik-1;
            while(q>0){
                bosluk = bosluk+"";
                q = q-1;
            }
            yaz = yaz + bosluk + yildiz +"\n";
            i = i+2;
            yukseklik--;
            }
        System.out.println(yaz);
                    
        }
        
    }
    
