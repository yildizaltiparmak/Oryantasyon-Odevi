package tahmin.et;
import java.util.Scanner;
public class TahminEt {

    
    public static void main(String[] args) {
        int sayi = (int)(Math.random()*101);
        Scanner giris = new Scanner(System.in);
        System.out.println("0 ile 100 arasında sınırlı" + "bir tam sayı tahmin ediniz");
        
        int tahmin = -1;
        while (tahmin != sayi){
            System.out.print("\nTahmin ediniz: ");
            tahmin = giris.nextInt();
            
            if (tahmin==sayi)
                System.out.println("Evet,sayi: " + sayi);
            else if (tahmin > sayi)
                System.out.println("Tahmininiz çok yüksek");
            else 
                System.out.println("Tahmininz çok düşük");
            
        }
        
       
    }
    
}
