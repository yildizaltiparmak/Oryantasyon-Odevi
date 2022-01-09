package mutlak.fark.sorusu;
import java.util.Scanner;
public class MutlakFarkSorusu {  
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = klavye.nextInt();
        int TekRakamlarToplami = 0;
        int CiftRakamlarToplami = 0;
        int TekRakamlarSayisi = 0;
        int CiftRakamlarSayisi = 0;
        while(sayi!=0){
            int basamakDegeri=sayi%10;
            sayi = sayi/10;
            if(basamakDegeri%2==0){
                CiftRakamlarToplami = CiftRakamlarToplami+basamakDegeri;
                CiftRakamlarSayisi++;
            }
            else{
                TekRakamlarToplami = TekRakamlarToplami + basamakDegeri;
                TekRakamlarSayisi++;
            }
                 
        }
        System.out.println("Girilen sayının basmak sayısı"+(TekRakamlarSayisi+CiftRakamlarSayisi));
        System.out.println("Tek rakamların topamı"+(TekRakamlarToplami));
        System.out.println("Çift rakamların toplamı"+(CiftRakamlarToplami));
        System.out.println("Tek ve Çift rakamlar arasındaki mutlak fark"+Math.abs(TekRakamlarToplami-CiftRakamlarToplami));
        
        
    }
    
}
