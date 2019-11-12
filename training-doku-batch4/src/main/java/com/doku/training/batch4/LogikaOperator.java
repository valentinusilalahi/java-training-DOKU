package com.doku.training.batch4;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-11-11
 * Time: 13:28
 * To change this template use File | Settings | File and Code Templates.
 */
public class LogikaOperator {
	
	public static void main(String xxx[]){
//		boolean T = true;
//		boolean F = false;
//
//		boolean kondisi1 = T || T && F;
//		boolean kondisi2 = F || T && T;
//		boolean kondisi3 = F || F && T;
//		boolean kondisi4 = F || F && F;
//
//		System.out.println(kondisi1);
//		System.out.println(kondisi2);
//		System.out.println(kondisi3);
//		System.out.println(kondisi4);
		
//		int x =1;
//		int y;
//
//		switch (x){
//			case 1 :
//				System.out.println(y = 1+2);
////				break;
//			case 2 :
//				System.out.println(y = 2+3);
////				break;
////				default:
////					System.out.println(y = 1+1);
////					break;
//		}
		
		int k = 1;
		
		for(int i=0; i<5; i=k+2){
			System.out.println("jumlah: " + i);
		}
	}
	
	public void switchCaseSample(){
		int x =2;
		int y;
		
		switch (x){
			case 1 : y = 1+2;
			case 2 : y = 2+3;
		}
		
	}
	
}
