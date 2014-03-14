/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Sam
 */
public class KLarge {

    public KLarge() {
    }
   
  
    public Queue<Integer> findKLarge(Integer[] inArr,int k){
        Queue<Integer> myQue=new PriorityQueue<Integer>();
        int i=0;
        while(i<k){
            myQue.add(inArr[i]);
            i++;
        }
        while(i<inArr.length){
            if(myQue.peek()<inArr[i]){
                System.out.println("Peek element="+myQue.peek());
                System.out.println("Array element="+inArr[i]);
                myQue.poll();
                myQue.add(inArr[i]);
            }
            i++;
        }
        return myQue;
        
    }
}
