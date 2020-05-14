package org.programing.datastructure;

import java.util.HashSet;
import java.util.Set;

public class StringPatternMatching {
	
	private static int[] prefixTable(String pattern){
		int[] table = new int[pattern.length()];
		table[0] = 0;
		int i = 0;
		for(int j = 1; j < pattern.length(); j++){
			if(pattern.charAt(i)==pattern.charAt(j)){
				table[j]=++i;                    
			}else{
				table[j]=0;
				i = 0;
			}                     
		}
		return table;
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
	    Set<Character> rN = new HashSet<>();
	    int[] rN_count = new int[120];
	    
		 int ransomNoteLength = ransomNote.length();
	     int magazineLength  = magazine.length();
	        
		if(magazineLength == 0 || ransomNoteLength == 0)
            return false;
        
		if( ransomNoteLength > magazineLength)
			return false;
		  
		for(int i = 0 ; i < ransomNote.length(); i++){
			rN.add(ransomNote.charAt(i));
			rN_count[ransomNote.charAt(i)] = rN_count[ransomNote.charAt(i)]+1;
	        }
	        
		for(int i = 0 ; i < magazine.length(); i++){
			rN_count[magazine.charAt(i)] = rN_count[magazine.charAt(i)]-1;
		}
		
		for(char ransomChar : rN){
			if(rN_count[ransomChar] > 0 )
				return false;
		}

		return true;

	}
	
	public static void main(String[] args) {
		 StringBuffer bin_rep = new StringBuffer();
		 int num = 7;
		 int complement = 0;
	     int i = 0 ;
	     
	     //100 ->4 001
	     //011 ->3
	     	     
	     //110 - 6
	     //001- > 1
	     
	      
	        
	        while(num > 0 ){
	            int r = num % 2 ;
	            bin_rep = bin_rep.append(r);
	            num = num / 2;   
	        }
	        
	        int length = bin_rep.length() - 1 ;
	        
	        System.out.println(bin_rep);
	        
	      
	        while(i <= length){
	        	if(bin_rep.charAt(i)=='0')
	        		complement  = (int) (complement + Math.pow(2, i));    
	        	
	              i++;
	        }

	        System.out.println(complement);
	}

}
