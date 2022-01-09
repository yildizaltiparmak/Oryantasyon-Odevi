package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("A Sayısını Giriniz");
        float A = k.nextFloat();
        System.out.println("B Sayısını Giriniz");
        float B = k.nextFloat();
  
        float carpim = A*B;
        
       System.out.println(carpim);
    }
    
}
