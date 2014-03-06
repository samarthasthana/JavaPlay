/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Sam
 */
public class PermuteString {
    public Set<String> permString(String inStr){
		char[] myStr=inStr.toCharArray();
		char temp;
		Set<String> retSet=new LinkedHashSet<>();
		int len=inStr.length();
		for(int i=0;i<inStr.length();i++){
			for(int j=0;j<inStr.length();j++)
			{
				temp=myStr[i];
				myStr[i]=myStr[j];
				myStr[j]=temp;
				retSet.add(String.copyValueOf(myStr));
			}
		}
                Iterator it=retSet.iterator();
                while(it.hasNext()){
                   System.out.println(it.next());  
                }               
		return retSet;
	}
}
