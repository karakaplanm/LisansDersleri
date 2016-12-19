//14 Kasım 2014 Tarihinde yapı
lan Vize sınavı soruları ve çözümleri.
public class VizeSinav{
    public static void main(String [] args) {
    //1. Soru: 1 den 100 e kadar çift sayıların toplamı
    int toplam=0, i;
    for(i=0;i<=100;i=i+2) toplam=toplam+i;
    System.out.println("1. Soru) Toplam="+ toplam);
    //2. Soru: Dik kenarları verilen bir üçgenin hipotenüs ve alanı
    double a=3.0, b=4.0,c, alan;
    c=Math.sqrt(a*a+b*b); alan=(a*b)/2.0;
    System.out.println("2. Soru) c="+c + " alan="+ alan);
    //3. Soru: İki sayının ortalamasını döndüren fonksiyon;
    System.out.println("3. Soru) Ortalama="+ ortalama(6.5,9.4));
    //4. Soru: Çarpımları 3840 yapan iki basamaklı ikili sayıların listesi
    System.out.println("*** 4. Soru ***");
    for (int x=10;x<100;x++){
        for (int y=10;y<100;y++){
                if((x*y)==3840) System.out.println(x+"*"+y+"=3840");
        }
    }

    //5. Soru Silindirin yüzey alanı ve hacmi
    double r=5.4, h=7.2, yuzeyalan, hacim;
    yuzeyalan=2*Math.PI*r*h+ 2*Math.PI*r*r;
    hacim=Math.PI*r*r*h;
    System.out.println("5. Soru) Alan="+ yuzeyalan + " Hacim="+ hacim);
    }

    //3. sorudaki fonksiyon
    public static double ortalama(double a, double b) {
        return (a+b)/2.0;
    }

}
