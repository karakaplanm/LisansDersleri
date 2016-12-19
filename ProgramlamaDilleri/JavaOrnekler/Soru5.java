import java.util.Scanner;
public class Soru5 {
  public static void main(String args[]){
    Scanner giris=new Scanner(System.in);
    System.out.print("Sayı Gir :");
    double a=giris.nextDouble();
    if (((double)a/2.0 - (int) a/2) >0)  System.out.println(a + " Tek");
    else System.out.println(a + " Çift");
  }
}
