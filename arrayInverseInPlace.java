/*Code for array inverse inplace with time complexity O(n/2)*/
import java.util.*;
class arrayInverseInPlace{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6};
		int c=a.length/2,j=a.length-1;
		for (int i=0;i<c ;i++) {
			/*int temp=a[i];
			a[i]=a[j];
			a[j]=temp;*/
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];

			j--;
		}
		System.out.println(Arrays.toString(a));
	}
	
}