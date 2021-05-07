package task;

import java.util.*;
public class CaesarCipherEncryption {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String original_text = "";
        int shift=0;
       try {
    	   System.out.print(" Input the plaintext message : ");
            original_text = sc.nextLine();
           System.out.print(" Enter the value by which every character of the original text message shifts : ");
          shift = sc.nextInt();
	 
    
       
        
        String cipher_text = "";
        char alphabet;
        for(int i=0; i < original_text.length();i++) 
        {
             
            alphabet = original_text.charAt(i);
            
          
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
            
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             cipher_text = cipher_text + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             cipher_text = cipher_text + alphabet;
            }
            else {
             cipher_text = cipher_text + alphabet;   
            }
        
    }
    System.out.println(" ciphertext : " + cipher_text);
       }
       catch (Exception e) {
   		// TODO: handle exception
   		System.out.println("Enter a valid input. ");
   		
   	}
  }
}