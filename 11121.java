package sdfsdf;
import java.util.*;
public class c {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);	
int N;
N=sc.nextInt();
int i=1;
while(N-->0) {
	String s="";
String r="";
	
	int n=sc.nextInt();

	boolean a=true;
	while(a)
	{	
	int div=n/-2;
	int res=n-(div*-2);
		
		
		if(res<0) {
			div++;
			
			res=n-(div*-2);
			
		}
	
		n=div;
		r+=res;
		if(div==0) {
			break;
		}
	
		
		
	}
	r=reverse(r);
	
	s="Case #"+i+": "+r;
	System.out.println(s);
	
	
	i++;
	
	
	
	
}

	}
public static String reverse(String s) {
	String r="";
	for (int i = s.length()-1; i>=0; i--) {
		
		r+=s.charAt(i);
	}
	return r;
}
}
