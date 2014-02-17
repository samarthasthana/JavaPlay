/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

//Implementing Queue using ArrayList

import java.util.ArrayList;


class QueueA{
	
	private ArrayList arr;

	QueueA(){
		arr=new ArrayList();		
	}

	public void enqueue(int val){
		arr.add(val);
	}

	public int dequeue(){
		return (int)arr.remove(0);
	}

	public int get_length(){
		return arr.size();
	}
}

