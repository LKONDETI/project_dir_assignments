package generics;

import java.util.Arrays;
public class genericSwap {
	
	public static void swap(int[] a, int i,int j){
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}

	public static void main(String[] args){
	int[] a={1,2,3,4};
	System.out.println("before: "+Arrays.toString(a));
	swap(a,1,3);
	System.out.println("after: "+Arrays.toString(a));
	}
}

