import java.util.*;
class balStr 
{
static  boolean balance(String s, int start, int end)
{
   
   if (start == s.length()) return end == 0;
   if (end<0) return false;
   if (s.charAt(start) == '(' || s.charAt(start) == '{' || s.charAt(start) == '[')
     return balance(s, start+1, end+1);
   if (s.charAt(start) == ')' || s.charAt(start) == '}' || s.charAt(start) == ']')
     return balance(s, start+1, end-1);
   return balance(s, start+1, end );
}

	public static void main(String[] args){
         Scanner a=new Scanner(System.in);
	String s=a.next();
	int start=0,end=0;
	boolean flag=balance(s,start,end);
	if(flag==true)
	System.out.print("Balanced");
	 else
	   System.out.print("Not Balanced");
	}
   }