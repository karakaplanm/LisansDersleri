public class AsalSayi {
   public static void main(String [] args) {
     int sayi;
     boolean asal;
     int i;
     System.out.println("Asal Sayıların Listesi");

     for (sayi=2;sayi<=100;sayi++){
        asal=true;
        i=2;
        while (asal==true && i<sayi){
           if (sayi%i==0) asal=false;
           i++;
        }

        if (asal==true) System.out.println(sayi);
     }
  }
}
