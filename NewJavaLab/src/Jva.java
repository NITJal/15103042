
public class Jva {
	public static void main(String args[]) {
		// int arr[4];
		int arr[] = new int[5];// NO ERROR
		// int b[]=new int[5] {1,2,3,4,5};//ERROR
		int c[] = new int[] { 1, 2, 3, 4, 5 };// no error
		int d[][] = new int[5][];// no error
		// int e[][]=new int[][5];//Error
	int k[][]=new int[4][3];
	k[0]=new int[4];
	k[1]=new int[2];
	k=new int[3][2]; 
	}
}
