/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

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
    }
    public static void main(String[] args) {
      JavaPlay tester=new JavaPlay();
      //tester.testing_StringRev();      
    }
}
