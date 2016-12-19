import java.util.Scanner;
public class Sayibul {
  public static void main(String[] args){
  int sayi,tahmin=-1;
  int basari=0,alt=0,ust=100;
  sayi=(int)(Math.random()*ust);
  Scanner giris=new Scanner(System.in);
  while(tahmin!=sayi){
    basari++;
    System.out.print(alt+"<SAYI<"+ust);
    System.out.print(" tahmin?");
    tahmin=giris.nextInt();
    if (tahmin<sayi) alt=tahmin;
    if (tahmin>sayi) ust=tahmin;
    }
  System.out.print(basari);
  System.out.println(" Defada buldun");
  }
}

