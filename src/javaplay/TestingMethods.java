/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
/**
 *
 * @author Sam
 */
public class TestingMethods {
    public static int MAXI=10;
    
        private void print_arr(Integer[] arr){
            System.out.println("Printing array contents");                   
		for(Integer val : arr){
			System.out.print(val+"\t");
		}
                System.out.println();
        }
        private void print_strArr(String[] arr){
            System.out.println("Printing String array");
            for(String str:arr){
                System.out.print(str+"\t");
            }
            System.out.println();
        }
        
        public void testing_StringArrays(){
            String test="This,Is,A,Test,String";
            String[] myStr=new String[MAXI];
            // testing array methods
            System.out.println("Length ="+myStr.length);
            Arrays.fill(myStr ,"Sam");
            print_strArr(myStr);
            Arrays.fill(myStr ,1,4,"Sona");
            print_strArr(myStr);
            Arrays.sort(myStr);
            print_strArr(myStr);
            Comparator <String> compare=Collections.reverseOrder();
            Arrays.sort(myStr,compare);
            print_strArr(myStr);
            
            System.out.println(test);
            System.out.println(test.matches("T.*"));
            System.out.println(test.length());
            System.out.println(test.charAt(2));
            System.out.println(test.compareTo("ThisIsATestString"));
            System.out.println(test.concat("Awesome"));
            myStr=test.split(",");
            print_strArr(myStr);
            
        }
        
  	public void testingArrays(){		
		Integer[] myInts=new Integer[MAXI];
		// check if the length is displayed
		System.out.println("Length ="+myInts.length);
		// check if the array can be filled with 0's		              
		Arrays.fill(myInts,0);
		print_arr(myInts);            
                Arrays.fill(myInts,2,3,4);// fills the number4 from 2 to 3,3 not included
		print_arr(myInts);
                
                Random rdm=new Random();
		for(int i=0;i<myInts.length;i++){
			myInts[i]=rdm.nextInt(11);
		}   
                print_arr(myInts);                              
                // to sort is descending order 
                Comparator<Integer> compare=Collections.reverseOrder();   
                Arrays.sort(myInts,compare);
                print_arr(myInts);                                
	}   
        public void testMaps(){
            Map<Character,Integer> myMap=new HashMap<>();
            String test="This is the test sentence ";
            test=test.trim();
            for(char ch:test.toCharArray()){
                if(myMap.containsKey(ch)){
                    myMap.put(ch, myMap.get(ch)+1);
                }else{
                    myMap.put(ch,(Integer)1);                    
                }
            }
            System.out.println(myMap.size());
            Iterator it=myMap.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair=(Map.Entry)it.next();
                System.out.println(pair.getKey()+" = "+pair.getValue());  
                it.remove();
            }
        }
        
        private void print_Set(Set<Character> set){
            System.out.println("Printing Set");
            System.out.println("Size="+set.size());
            Iterator<Character> it=set.iterator();            
            while(it.hasNext()){
                System.out.print(it.next()+"\t");
            }
            System.out.println();
        }
        public void testSet(){
            // contains , add , isEmpty, size , iterator
            Set<Character> myHashSet=new HashSet<>();
            Set<Character> myLinkSet=new LinkedHashSet<>();
            Set<Character> myTreeSet=new TreeSet<>();
            String test="Samarth Asthana";
            for(Character ch: test.toCharArray()){
                myHashSet.add(ch);
                myLinkSet.add(ch);
                myTreeSet.add(ch);
            }            
            print_Set(myHashSet);
            print_Set(myLinkSet);
            print_Set(myTreeSet);
        }
        
        private void print_List(List<Character> lst){
            Iterator<Character> it=lst.iterator();
            while(it.hasNext()){
                System.out.print(it.next()+"\t");
            }
            System.out.println();
        }
        public void test_Lists(){
            // add remove contains iterator clear size
            List<Character> myList=new ArrayList<>();
            List<Character> myLinkList=new LinkedList<>();
            List<Character> myVector=new Vector<>();
            
            String test="Samarth asthana";
            for(Character ch: test.toCharArray()){
                myList.add(ch);
                myLinkList.add(ch);
                myVector.add(ch);
            }
            print_List(myList);
            while(myList.indexOf('a')!=-1){
                myList.remove(myList.indexOf('a'));
            }
            print_List(myList);
        }
        
        public void test_priority(){
            PriorityQueue<Integer> pq=new PriorityQueue<>(MAXI,Collections.reverseOrder());
            pq.add(10);
            pq.add(19);
            pq.add(21);
            pq.add(8);
            pq.add(5);                        
            System.out.println("Printing the Queue");
            
            while(!pq.isEmpty()){
            System.out.println(pq);
            System.out.println(pq.poll());                
            }                       
        }
        
        public void check_odd(Integer arr[]){
            Set<Integer> mySet=new HashSet<>();
            for(Integer num:arr){
                if(mySet.contains(num))mySet.remove(num);
                else mySet.add(num);
            }
            System.out.println(mySet);
        }
        
}
