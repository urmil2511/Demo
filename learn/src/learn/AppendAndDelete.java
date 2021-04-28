package learn;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Re {


    public static String appendAndDelete(String s, String t, int k) {
       int count=0;
       if(s.length() + t.length()<k) {
    	   return "Yes";
       }
       
       for(int i=0;i<t.length();i++)
       {
             if(s.length()>i && s.charAt(i)!=t.charAt(i))
               {
            	 count =t.length()-i;
            	 t=t.substring(0, i);
            	 break;
               }
       }
       StringBuilder build = new StringBuilder(s);
       StringBuilder sb = new StringBuilder(t);
       if(count>k)
       {
    	   return "NO";
       }
       else
       {
    	   int n=sb.length();
    	   for(int i=n;i<build.length();i++)
    	   {
    		   sb.append(build.charAt(i));
    		   count++;
    	   }
       }
       return (count>k)?"No": (k<sb.length() + build.length() && k>=sb.length()) ?"No":"Yes";
    }

}

public class AppendAndDelete {

	public static void main(String[] args) {
		
		String s="aaa";
		String t="a";
		int k=5;
		String result = Re.appendAndDelete(s, t, k);
System.out.println(result);
	}

}
