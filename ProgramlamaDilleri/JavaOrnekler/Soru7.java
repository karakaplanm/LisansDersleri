public class Soru7{
   public static void main(String[] args) {
      kareyaz(10);
      kareyaz(20);
   }
	
   public static void kareyaz(int N) {
	int x,y;
	for (y=0;y<N;y++) {
	  for (x=0;x<N;x++) { 
	   if (x==0 || y==0 || x==N-1 || y==N-1) System.out.print("*");
	   else System.out.print(" ");
	  }	   	
	 System.out.println();
        }
  }
}
