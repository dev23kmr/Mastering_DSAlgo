package org.programing.datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class firstUniqueCharacter {
	
	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> lmap = new LinkedHashMap<>();
		char mainC = 0;
		int flag = 0;
		String str = "loveleetcode";
		for(int i = 0; i < str.length(); i++){
			if(lmap.containsKey(str.charAt(i))==true)
		lmap.put(str.charAt(i), lmap.get(str.charAt(i))+1);
			else
		lmap.put(str.charAt(i), 1);			
		}
		
		Iterator<Character> iter = lmap.keySet().iterator();
		
		
		while(iter.hasNext()){
		  char c = iter.next();	
		  if(lmap.get(c)==1){
			  mainC = c;
			  flag =1;
			  break;
		  }		  
		}
		
		int i = str.indexOf(mainC);
		
	}
	
	 public int firstUniqChar(String s) {
	        int res = Integer.MAX_VALUE;
	        
	        for(char c = 'a'; c <= 'z'; c++){
	            int index = s.indexOf(c);
	            
	            if(index != -1 && index == s.lastIndexOf(c))
	                res = Math.min(res, index);
	        }
	        
	        return res == Integer.MAX_VALUE ? -1 : res;
	    }

}
