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
public class JavaPlay {

    /**
     * @param args the command line arguments
     */
    public void testing_QueueQ(){
         QueueA test=new QueueA();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        System.out.println(test.get_length());
        test.enqueue(5);
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
    
    }
    
    public void testing_Stack2Q(){
        try{
        Stack2Q test= new Stack2Q();
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        System.out.println("Size ="+test.get_length());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void testing_fibo(){
         //testing Fibo
        Fibo obj =new Fibo();
        System.out.println(obj.calc_fibo(6));
        System.out.println(obj.fibo_cached(6));
    }
    
    public void testing_StringRev(){
        StringRev obj=new StringRev();
        System.out.println(obj.reverseString("This is a test String"));
        System.out.println(obj.reverseWords("Samarth Asthana"));
        System.out.println(obj.checkUniqueString("Sasthn3"));
    }
    
    public void testing_get_intersects_sorted(){
        ListIntersection obj=new ListIntersection();
        Integer [] a={2,4,6,8,10};
        Integer [] b={1,4,5,7,10};
        List<Integer> arr=obj.get_intersects_sorted(a,b,a.length,b.length);
        System.out.println(arr.toString());
    }
    
    public void testing_get_intersects_nos(){
     ListIntersection obj=new ListIntersection();
        Integer [] a={6,8,10,2,4,};
        Integer [] b={4,5,1,7,10};
        List<Integer> arr=obj.get_intersects_nos(a,b);
        System.out.println(arr);
    }
    
    public void testing_check_pal(){
    Palindrome obj=new Palindrome();
    System.out.println(obj.check_pal("Poliop"));
    }
    
    
    public void testing_find_intersection(){
    Palindrome obj=new Palindrome();
    List<Character> lst=new ArrayList<Character>();
    lst=obj.find_intersection("Samarth","ASthana");
    System.out.println(lst);
    }
    
    public void testing_bintree(){
        BinTree obj=new BinTree();        
        obj.add_element(obj.get_root(), 10);
        obj.add_element(obj.get_root(), 8);
        obj.add_element(obj.get_root(), 5);
        obj.add_element(obj.get_root(), 12);
        obj.add_element(obj.get_root(), 15);
        obj.add_element(obj.get_root(), 7);
        obj.add_element(obj.get_root(), 13);
        
        obj.inorder_trav(obj.get_root());
        System.out.println();
        System.out.println(obj.get_depth(obj.get_root()));
        
    }
    
    public void testing_UniqueString(){
        UniqueString obj=new UniqueString();
        System.out.println(obj.findUniqueString("Samarth Asthana"));        
    }
    
    public void testing_NumberQuestions(){
        NumberQuestions obj=new NumberQuestions();
        System.out.println(obj.factorial(5));
        System.out.println(obj.isPalindrome(6));
    }
    
    public void testing_permute(){
        String test="abc";
        boolean[] use=new boolean[test.length()];
        StringRev obj=new StringRev();
        obj.stringPermute(0, test, "", use);
    }
    
    public void testing_TestingMethods(){
        TestingMethods obj=new TestingMethods();
        Integer[] test={9,4,9,1,5};
        obj.check_odd(test);
    }
    
    public static void main(String[] args) {
      JavaPlay tester=new JavaPlay();
      tester.testing_TestingMethods();
    }
}
