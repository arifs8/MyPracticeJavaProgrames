package RahulShettyProgrammes;

import java.util.ArrayList;

public class CompareSameIndexTwoArraysandNewArray {

	public static void main(String[] args) {
		int[] a = {1,4,5,7};
		int[] b = {6,4,3,7};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == b[i]) {
				
				al.add(a[i]);
			}
		}
		
		
		System.out.println(al);
	}

}
