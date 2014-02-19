/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Palindrome{

	public boolean check_pal(String val){		
		val=val.toLowerCase();
		boolean res=true;
		int i=0,j=val.length()-1;		
		while(i<=j){
			if(val.charAt(i)!=val.charAt(j))res=false;
			i++;
			j--;
		}
		return res;
	}

	public List<Character> find_intersection(String val1,String val2){
		int i=0;
                int l1=val1.length(),l2=val2.length();
		val1=val1.toLowerCase();
		val2=val2.toLowerCase();
		HashSet ms=new HashSet();
		List<Character> lst= new ArrayList<Character>();
		while(i<l1){
			ms.add(val1.charAt(i));
			i++;
		}
		i=0;
		while(i<l2){
			if(ms.contains(val2.charAt(i)) && !lst.contains(val2.charAt(i)))lst.add(val2.charAt(i));
			i++;
		}
		return lst;
	}
}
