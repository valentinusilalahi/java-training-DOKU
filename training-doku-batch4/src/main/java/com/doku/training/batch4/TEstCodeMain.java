package com.doku.training.batch4;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-11-15
 * Time: 13:56
 * To change this template use File | Settings | File and Code Templates.
 */
public class TEstCodeMain {
	
	public static void main(String[] args) {
		int i, j;
		int k = 0;
		k = j = i = 1;
		System.out.println(k);
		
		int a[] = {1, 2, 3, 4};
		System.out.print(a instanceof Object);
		
		int[] arr = {1, 2, 3, 4};
		call_array(arr[0], arr);
		System.out.println(arr[0] + "," + arr[1]);
		
	}
	
	static void call_array(int i, int arr[]) {
		arr[i] = 6;
		i = 5;
	}
	
}
