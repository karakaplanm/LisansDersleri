public class BuyukKucuk {

	public static void main(String[] args) {
	 
	 int [] a= new int [5];
	 a[0]=3; a[1]=6; a[2]=4;
	 a[3]=7; a[4]=9;
	 
	 int min=999; int mak=-999;
	 for (int i=0;i<5;i++){
		 if (a[i]<min) min=a[i];
		 if (a[i]>mak) mak=a[i];
	 }
	 System.out.println("En Küçük:"+min+" En Büyük:"+mak);
	}
}
