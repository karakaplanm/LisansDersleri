public class Soru4{
   public static void main(String[] args) {
     System.out.println(faktoriyel(10));
   }
   public static int faktoriyel(int N) {
     int i, carpim=1;
     for (i=1;i<=N;i++) carpim=carpim*i;
     return carpim;
  }
}
