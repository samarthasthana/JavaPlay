/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaplay;

/**
 *
 * @author Sam
 */
public class NumberQuestions {
    
    public boolean check_reverse(Integer val){
	double digits=0.0,reverse=0.0;
	Integer temp=val;      
	if(val==null){
	return false;
	}
	else{
		while(temp!=0){
		digits++;
		temp=temp/10;
		}
		temp=val;
		while(digits!=0.0){
			reverse+=(temp%10) *(Math.pow(10.0, digits-1));                        
			temp=temp/10;
			digits--;
		}
		if(reverse==val.doubleValue())return true;
		else return false;
	}
}
 
    public int factorial(int n){
		if(n==1) return 1;
		else
		return n*factorial(n-1);
	}
    
    private Integer get_bit(int num,int pos){
	int mask=1;
	if(num==0)return null;
		else{
		mask=mask<<pos;//if pos==0 then the first bit is 1 rest 0
			if((num & mask )==0)return 0; else return 1;
		}
	}
    // 1001001
	// can find the number of bits it has by finding the power of 2 it is smaller of 
	//equal to or by shifting the number right 1 bit till the number is zero
	public boolean isPalindrome(int x){
	int temp=x,len=0,i=0;
	boolean check=true;
		while(temp!=0){
			len++;
			temp=temp>>1;
		}	
		while(i<len/2){
			if(get_bit(x,i)!=get_bit(x,len-1-i))check=false;
			i++;
		}
                return check;
	}
}
