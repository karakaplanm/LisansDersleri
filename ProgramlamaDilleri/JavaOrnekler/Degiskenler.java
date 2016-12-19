import java.util.Date;
public class Degiskenler {

      public static void main(String[] args){
      
      int [] a= new int[3];
      a[0]=13;a[1]=7;a[2]=9;
      System.out.println(a[0]+a[1]+a[2]);
      // ekrana 29 yazar
             
      int [] b={ 3,8,4,9,6};
      System.out.println(b[4]);
      // b nin 4. elemanıolan 6 yı yazar

      String veri="Linux";
      System.out.println(veri.substring(1,4) ); 
      // ekrana inu yazar     
      System.out.println(veri.charAt(4));  
      // ekrana x yazar    
      System.out.println(veri +" Uzunluk="+veri.length() );      
      // Ekrana Linux Uzunluk=5 yazar

      char kar[]=new char[10];
      kar[4]=65;
      System.out.println(kar[4]);      
      // Ekrana A yazar

      char data[] = {'a', 'b', 'c'};
      System.out.println(data[1]+""+data[2]);      
      // Ekrana bc yazar

      double x=22/7;
      System.out.println(x);
      // Ekrana 3.0 yazar

      double y=22.0/7;
      System.out.println(y);
      // Ekrana 3.142857142857143 yazar
      System.out.println((int)y);
      // Ekrana 3 yazar
      Date tarih = new Date();
      System.out.println("Tarih :" + tarih);
      // O anki tarih ve zaman bilgisini yazar.
    }
}
