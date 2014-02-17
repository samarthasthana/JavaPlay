package javaplay;

/**
 *
 * @author Sam
 */
public class StringRev {
    private String sent;

    StringRev() {
    sent="";
    }
    public char[] reverseString(String val){
        int i=0,j=val.length()-1;
        char[] temp=val.toCharArray();
        char buf;
        while(i<j){
            buf=temp[i];
            temp[i]=temp[j];
            temp[j]=buf;            
            i++;
            j--;            
        }
        return temp;
    }    
    
    private char[] revWord(char[] val,int j,int i){
        int li=j,lj=i;
        char buf;
        while(li<lj){
            buf=val[li];
            val[li]=val[lj];
            val[lj]=buf;        
            li++;
            lj--;
        }
        return val;
    }
    
    public char[] reverseWords(String val){       
        int i=0,j=0;
        val=val+' ';
        char[] temp=val.toCharArray();
        //val="";
        while(i<val.length()){
            if(temp[i]==' '){
                temp=revWord(temp,j,i);
                j=i+1;                
            }            
            i++;
        }
        return temp;
    }        
}
