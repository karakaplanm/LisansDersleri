public class Diziler{
        public static void main(String[] args)
        {
                int [] a= new int[5];
                a[0]=5;a[1]=7;a[2]=3;a[3]=6;a[4]=4;
                int toplam=0;
                for (int i=0;i<5;i++){
                        System.out.println(i+1+".) "+ a[i]);
                        toplam=toplam+a[i];
                }
                System.out.println(toplam);
                double [] b={3.4, 5.2, 7.1, 6.9, 9.2};
                double topd=0.0;
                for (int i=0;i<5;i++) {
                        topd=topd+b[i];
                        System.out.println(i+1+".) "+ b[i]);
                }
                System.out.println("Toplam="+topd+" Ortalama="+topd/5.0);
        }
}
