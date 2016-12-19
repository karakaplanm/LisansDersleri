public class Kokonat {

	public static void main(String[] args) {
		
	double kalan;
	int ceviz,i;
	String pay;
	for (ceviz=6;ceviz<20000;ceviz++) {
		kalan=ceviz;pay="Sıra\tYığın\tMaymun\tAlınan\n";
			for(i=0;i<6;i++) {
				pay=pay+(i+1)+". \t"+(int) kalan+"\t"+1+"\t"+(int)(kalan-1)/5+"\n";
				kalan=(kalan-1)*(4.0/5.0);
			}
		   if ((kalan-(int)kalan)==0) System.out.println(pay);
	}
	
	}
}
