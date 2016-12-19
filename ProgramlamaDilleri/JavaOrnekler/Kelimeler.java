public class Kelimeler {

	public static void main(String[] args) {
		int harf;		
		for (int i=0;i<100;i++)
		{
			for (int h=0;h<5;h++) {
				harf=(int) (Math.random()*(90-65)+65);
				System.out.print((char) harf);
			}
			System.out.print(" ");
			if (i%10==0) System.out.println("");
		}	
	}
}
