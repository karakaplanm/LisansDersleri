
public class Sayilar {

	public static void main(String[] args) {
	int i,j,k;
	long sonuc;
	long yanyana;
		for (i=100;i<=999;i++){
			for (j=100;j<=999;j++){
				for (k=100;k<=999;k++){
				sonuc=i*i*i+j*j*j+k*k*k;
				yanyana=i*1000000+j*1000+k ;
				if (sonuc==yanyana) System.out.format("%3d^3+%3d^3+%3d^3=%,9d\n", i,j,k,sonuc);			}
			}
		}
	}

}
