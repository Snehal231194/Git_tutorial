package Just_Pr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test23_11{

	public static void main(String[] args){
		
	        //Scanner sc=new Scanner(System.in);
	        String s="Snehal Gulhane" ;
	        s=s.replace(" ","");
	     int   count=0;
	        char arr[]=s.toCharArray();
	        Map<Character,Integer>charayy=new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	           count=0;
	           
	            for(int j=0;j<arr.length;j++){
	                if(arr[i]==arr[j]){
	     
	             count++ ;
	                }
	         }
	        
	            charayy.put(arr[i],count);
	        System.out.println(charayy);
	        }
	        }
	   
	}
