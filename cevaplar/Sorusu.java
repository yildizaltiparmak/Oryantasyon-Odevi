package pkg1.pkg99.sorusu;
import java.util.Scanner;
public class Sorusu {
    public static void main(String[] args) {
        Byte a;
        String s = null;
        String[]Bir = {"Bir","İki","Üç","Dört","Beş","Altı","Yedi","Sekiz","Dokuz"};
        String[]On = {"On","Yirmi","Otuz","Kırk","Elli","Atmış","Yetmiş","Seksen","Doksan"};
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz=");
        a = oku.nextByte();
        if (a/10>0){
            s = On[(a/10)-1];
        }    
        if (a%10!=0){
            s = s+Bir[(a%10)-1];
        }
        System.out.println(s);
        
    }
       
    }
    

