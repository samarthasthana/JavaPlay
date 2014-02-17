/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

import java.lang.IndexOutOfBoundsException;

// Implementing Stack using two Queues
class Stack2Q{
	private QueueA q1,q2;
	Stack2Q(){
		q1=new QueueA();
		q2=new QueueA();
	}

	public void push(int val){
		if(q2.get_length()==0)q1.enqueue(val);
		else q2.enqueue(val);
	}

	public int pop() throws IndexOutOfBoundsException {
		if(get_length()==0){throw new IndexOutOfBoundsException();}
		else{
			if(q2.get_length()==0){
				while(q1.get_length()!=1)
					q2.enqueue(q1.dequeue());
				return q1.dequeue();
			}
			else{
				while(q2.get_length()!=1)
					q1.enqueue(q2.dequeue());
				return q2.dequeue();
			}
		}				
	}

	public int get_length(){
		return q1.get_length()+q2.get_length();
	}
}

