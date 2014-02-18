/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

// find hte intersection of two lists

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


// given two list 

// 2 4 5 7 9 12
// 1 4 8 10 11 
// brute force
// start pointers together.. if sorted
// not sorted then use int[] to put in list 1, go thru list 2 and mark ones that //occur again
class ListIntersection{
	
	private int[] val;

	private void init_arr(int max){
		val=new int[max];		
	}

        public List<Integer> get_intersects_nos(Integer[] a,Integer[] b){
		List <Integer> lst = new <Integer>ArrayList();
		HashSet hm=new HashSet();
		int i=0;
		while (i<a.length){
			hm.add(a[i]);			
			i++;
		}
		i=0;
		while(i<b.length){
			if(hm.contains(b[i]))lst.add(b[i]);
			i++;
		}
		return lst;
	}
        
	public List<Integer> get_intersects_sorted(Integer [] a, Integer [] b,int len1,int len2){
		int i=0,j=0;
		ArrayList arr=new ArrayList();		
		while(i+j < len1+len2){
			if(a[i]<b[j]){
			//move a
			i++;
			}
			else if(a[i]>b[j]){
			//move b			
			j++;
			}
			else{
			//store in arr and move both
			arr.add(a[i]);
			i++;
			j++;
			}
		}//while
	 return	arr;
	} 
}
