package bottel;

import java.util.StringTokenizer;

public class stand {
	
public static void main(String[] args) {
	int a=20, b=30, c=21, d=3, e=23;
	String x="Vinja" ,y="Patel";
	boolean abc =true;
	c=++a;
	System.out.println("x + y = "+(x+ y));
	System.out.println("a%b="+(b%a));
	System.out.println("c(+++a)="+c);
	System.out.println("abc="+!abc);
	System.out.println("a<=b  "+(a<=b));
	System.out.println(a<<1);
	System.out.println(d+e);
	
	StringBuffer s =new StringBuffer("GeeksforGeeks");
	int l =s.capacity();
	System.out.println(l);
	s.append("Vinja");
	System.out.println(s.reverse());
	StringTokenizer st3 = 
        new StringTokenizer("JAVA:Code:String", " :", true);
   while (st3.hasMoreTokens())
       System.out.println(st3.nextToken());
   StringBuffer s1=new StringBuffer("Geeks");
   String s2=s1.toString();
   System.out.println(s2);
   String s3=s1.toString();
   StringBuilder s4=new StringBuilder(s3);
   System.out.println(s4);
   System.out.println(s3);
   int p=1234;
   int q=-1234;
   String s5= Integer.toString(p);
   String s6= Integer.toString(q);
   System.out.println(s5+s6);
   int k = 345;
   String customString = Integer.toOctalString(k);
   System.out.println(customString);
   int stringExample = Integer.parseInt("geeks",29);
   System.out.println(stringExample);
   String str= "geeksforforgeeksfor  aa";
   String [] strarr=str.split("for");
   for(String arr : strarr)
	   System.out.println(arr);
   String a1="Hello";
   String b1="Teamasdsad";
   System.out.println("Before swapping :" +a1+b1);
   a1=a1+b1;
   b1=a1.substring(0,a1.length()-b1.length());
   a1=a1.substring(b1.length());
   System.out.println("After swapping:"+a1+b1);
   String test="geeksforgeeks";
   System.out.println(test);
   String str1 = "GeeksforGeeks is a computer science portal";
   
   System.out.println(str1.startsWith("Geek"));
   String input="Geeks for geeks";
   char[] ch=input.toCharArray();
   for (int i=input.length()-1;i>=0;i--)
	   System.out.print(ch[i]);
   
}
}
