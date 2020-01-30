import java.util.*;
public class _455 {

	public static void main(String[] args) {
		int n;
		Scanner sc;
		sc=new Scanner(System.in);
		n=sc.nextInt();
		String s;
		
		while(n-->0) {
			int i=1;
			System.out.println();
			s=sc.next();
			for( i=1;i<s.length();++i) {
				if(s.length()%i!=0) {
					continue;
				}
				if(mismos(s,i)) {
					System.out.println(i);
					break;
				}
				
			}
			if(i==s.length()) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
	}
	public static boolean mismos(String s,int i) {
		for(int x=0;x<s.length();x++) {
			for(int j=x+i;j<s.length();j+=i) {
				if(s.charAt(x)!=s.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;
	}

}
