/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

/**
 *
 * @author Sam
 */
class Fibo{
	
	private int[] arr;
	public int calc_fibo(int n){
		if(n==0 || n==1)return 1;
		else
		{
			return calc_fibo(n-1)+calc_fibo(n-2);
		}

	}

	private void set_cac(int n){
	arr=new int[n];
	}

	private int cac_fibo(int n){
		if(n==0 || n==1)return 1;
		else{
		if(arr[n-1]==0)arr[n-1]=cac_fibo(n-1);
		if(arr[n-2]==0)arr[n-2]=cac_fibo(n-2);
		return arr[n-1]+arr[n-2];
		}
	}
	public int fibo_cached(int n){
	set_cac(n);
	return cac_fibo(n);
	}
}


