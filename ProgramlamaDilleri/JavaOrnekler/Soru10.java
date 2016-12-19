public class Soru10{
   public static void main(String[] args) {
     System.out.println(enbuyuk(3,7));
     System.out.println(enbuyuk(56,34));
   }
	
   public static int enbuyuk(int a, int b) {
     if(a>b) return a;
     else return b;
   }
}
