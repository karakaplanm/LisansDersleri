import java.util.Scanner;
public class FindWaldo {
  public static void main(String[] args){


  System.out.println("Enter dimension D to create DxD matrix:");

  Scanner giris=new Scanner(System.in);
  int M=giris.nextInt();
  int H=(int) (Math.sqrt(M)+1.0);

  int W_X=(int)(Math.random()*(M-Math.sqrt(M))-1)+(int) Math.sqrt(M);
  int W_Y=(int)(Math.random()*(M-Math.sqrt(M))-1)+(int) Math.sqrt(M);

  System.out.println("Dimensions: "+M+"x"+M);
  System.out.println("Cheats left:"+ H);
  int X=0, Y=0;
  int sayac=0;
  int found=0;
  while(found==0){
    System.out.println("You're at ("+X+","+Y+")"); 
    for (int j=0;j<M;j++)
	{
	for (int i=0;i<M;i++)
	{
		if ((i==X) && (j==Y)) System.out.print("O");
		else System.out.print("X");
	
	}
	   System.out.println("");
	}

    System.out.print("Enter your choice (a:left,d:right,w:up,s:down) :");
    Scanner reader=new Scanner(System.in);
    char ch = reader.next().charAt(0);

     if (ch=='a' || ch=='A'){
		if (X>0) {X--;sayac++;}
		else System.out.println("Can't go left!.");	
	} 

     if (ch=='d' || ch=='D'){
                if (X<M-1) {X++;sayac++;}
                else System.out.println("Can't go right!.");
        }

     if (ch=='w' || ch=='W'){
                if (Y>0) {Y--;sayac++;}
                else System.out.println("Can't go up!.");
        }

     if (ch=='s' || ch=='S'){
                if (Y<M-1) {Y++;sayac++;}
                else System.out.println("Can't go down!.");
        }
     
     if ((ch=='c' || ch=='C') && H>0 ){
	  H--;
	  int min_dist=(Math.abs(X-W_X)+ Math.abs(Y-W_Y) );
	  System.out.println("You have "+ H + " cheats left.");
	  System.out.println("You're "+min_dist+" moves away from Waldo.");
	}

	if (X==W_X && Y==W_Y) {
		System.out.println("Congrats! You found Waldo at ("+W_X+","+W_Y+")");
		System.out.println("Minimum of possible movements was "+ (W_X+W_Y)+".");
		System.out.println("You moved "+ sayac+ " times.");
		found=1;
	}


    }
  }
}
