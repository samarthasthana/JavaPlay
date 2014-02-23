/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
class UniqueString{
	public String findUniqueString(String inStr){
		// traverse and add to the Set
                List<Character> my_list=new ArrayList<Character>();
                StringBuilder str_bl=new StringBuilder();
		int i=0;
		while(i<inStr.length()){
                    if(!my_list.contains(inStr.charAt(i))){
                        my_list.add(inStr.charAt(i));
                        str_bl.append(inStr.charAt(i));
                    }					
			i++;
		}
                return str_bl.toString();
	}
}
