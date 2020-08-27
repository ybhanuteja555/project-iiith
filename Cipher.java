import java.util.*;
class Cipher
{ 
    
    
    public static StringBuffer endecrypt(String data, int key) 
    { 
        StringBuffer r= new StringBuffer(); 
  
        for (int i=0; i<data.length(); i++) 
        { 
  	   
            if (Character.isUpperCase(data.charAt(i))) 
            { 
                char ch = (char)(((int)data.charAt(i)+key-65)%26+65);
                r.append(ch); 
                
            } 
            else if(Character.isLowerCase(data.charAt(i)))
            { 
                char ch = (char)(((int)data.charAt(i)+key-97)%26+97); 
                r.append(ch); 
                
            } 
	    else
	    {
	        r.append(data.charAt(i));
	     }
        } 
        return r; 
    } 
  
  
    
    public static void main(String[] args) 
    { 
        Scanner s=new Scanner(System.in);
        String data = s.nextLine(); 
        int key =s.nextInt(); 
 	System.out.println("choose your option");
	System.out.println("1:plain to cipher 2:cipher to plain");
       int opt=s.nextInt();
        switch(opt)
{
  case 1:StringBuffer en=endecrypt(data, key);
         System.out.println("encrypted-data: " + en); 
          break;
  case 2:System.out.println("decrypted-data: " + endecrypt(data, 26-key)); 
          break;
}
        
       
        
    } 
}