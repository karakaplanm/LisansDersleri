public class Fonksiyonlar {
	public static void main(String[] args) {
          System.out.println("Burası ana fonksiyon");
	  baslik();
	  hipotenus(3,4);
	  double v=silindir(5,8);
	  System.out.println("Silindirin Hacmi="+ v);
	  System.out.println("Çemberin Alanı="+ cember(5) );
	  System.out.println("1 den 100 e kadar "+ topla(100) );
	  System.out.println("1 den 500 e kadar "+ topla(500) );
	  
	}
	public static void baslik() {
		System.out.println("Burası da baslik fonksiyonu");
	}
	public static void hipotenus(double a, double b) {
		double c=Math.sqrt(a*a+b*b);
		System.out.println("c kenarı="+ c);
	}
	public static double silindir(double r, double h) {
		double hacim=Math.PI*r*r*h;
		return hacim;
	}
	public static double cember(double r) {	
		return Math.PI*r*r;
	}
	
	public static int topla(int N) {
	int toplam=0;int i;
	for (i=1;i<=N;i++) toplam=toplam+i;
	return toplam;
	
	}
}



