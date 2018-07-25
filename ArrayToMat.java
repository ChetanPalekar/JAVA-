import java.util.*;
class ArrayToMat{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9};
		int x=0;
		int mat[][]=new int[3][3];
		for (int k=0;k<3; k++) {
			int i=k;
			int j=0;
			while(i>=0){
				mat[i][j]=a[x];
				i=i-1;
				j=j+1;
				x++;
			}
		}
		for (int k=1;k<3 ;k++ ) {
			int i=2;
			int j=k;
			while(j<3){
				mat[i][j]=a[x];
				i=i-1;
				j=j+1;
				x++;
			}
		}
		for (int[] row : mat)
            System.out.println(Arrays.toString(row));
	}
}
