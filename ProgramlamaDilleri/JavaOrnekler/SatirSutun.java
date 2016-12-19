public class SatirSutun {
	public static void main(String[] args) {
	 int [][] b= new int [3][3];
	 b[0][0]=3; b[0][1]=2; b[0][2]=2;
	 b[1][0]=5; b[1][1]=7; b[1][2]=4;
	 b[2][0]=8; b[2][1]=4; b[2][2]=9;
	 int satirtoplam=0; int [] stoplam={0,0,0};
	 for (int i=0;i<3;i++){
		 for (int j=0;j<3;j++){
			 System.out.print(b[i][j]+ "  ");
			 satirtoplam=satirtoplam+b[i][j];
			 stoplam[j]=stoplam[j]+b[i][j];
		 }
		 System.out.println("="+satirtoplam);
		 satirtoplam=0;
	 }
	 System.out.println("-- -- --");
	 for (int j=0;j<3;j++) {
		 System.out.print(stoplam[j]+" ");
	 }	 
	}
}
