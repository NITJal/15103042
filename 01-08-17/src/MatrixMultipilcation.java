import java.util.Scanner;

public class MatrixMultipilcation {
   public static void main(String args[]) {
	   int r1,c1,r2,c2;
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the Rows and column of matix 1");
	   r1=scan.nextInt();
	   c1=scan.nextInt();
	   System.out.println("Enter the rows and column of matrix 2");
	   r2=scan.nextInt();
	   c2=scan.nextInt();
	   if(c1!=r2) {
		   System.out.println("Multipication is not possible");
	   System.exit(1);}
	   int m1[][]=new int[r1][c1];
	   int m2[][]=new int[r2][c2];
	   int m3[][]=new int[r1][c2];
	   System.out.println("Enter the elements of the Matrix 1");
	   for(int i=0;i<r1;i++ ) {
		   for(int j=0;j<c1;j++)
			   m1[i][j]=scan.nextInt();
	   }
	   System.out.println("Enter the elements of the Matrix 2");
	   for(int k=0;k<r2;k++ ) {
		   for(int l=0;l<c2;l++)
			   m2[k][l]=scan.nextInt();
	   }
	   for(int p=0;p<r1;p++) {
		   for(int q=0;q<c2;q++) {
			   for(int r=0;r<c1;r++) {
				   m3[p][q]+=m1[p][r]*m2[r][q];
			   }
		   }
	   }
	   for(int t=0;t<r1;t++) {
		   for(int y=0;y<c2;y++) {
			   System.out.print(m3[t][y]+" ");
		   }
		   System.out.println();
	   }
	   
	   
   }

}
