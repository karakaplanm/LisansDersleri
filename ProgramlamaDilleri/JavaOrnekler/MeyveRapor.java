public class MeyveRapor {
    public static void main(String[] args) {
        
	int elma=5;int armut=7; int ayva=9;
	int meyve;
	meyve=elma+armut+ayva;
	double elmay=((double)elma/(double) meyve)*100.0;
	
	System.out.print("Meyve Toplamı:");
	System.out.println(meyve);
	
	System.out.print("Elma Yüzdesi:");
	System.out.println(elmay);
	}
}
