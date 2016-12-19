public class Soru8{
   public static void main(String[] args) {
     double a=3; double b=4;
     double c=Math.sqrt(a*a+b*b);
     double ac=Math.acos(a/c)*180.0/Math.PI;
     double bc=Math.acos(b/c)*180.0/Math.PI;
     System.out.println("a="+a+" b="+b+" c="+c); 
     System.out.println("ac açısı="+ac); 
     System.out.println("bc açısı="+bc); 
   }
}
