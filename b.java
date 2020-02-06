package sdfsdf;
import java.util.*;
public class b {

	public static void main(String[] args) {
		int T,n,k;
		Scanner sc;
		sc=new Scanner(System.in);
		T=sc.nextInt();
		String s="";
		for(int i=1;i<=T;i++) {
			
			n=sc.nextInt();
			k=sc.nextInt();
			
			int[] a=new int[n];
			List<String> l=new ArrayList<>();
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			
			for(int j=0;j<n;j++) {
				for(int x=0;x<n;x++) {
					if(j==x) {
						continue;
					}
					else if(a[j]<=a[x] && (a[j]+a[x])%k==0 && !(l.contains(a[j]+","+a[x]))) {
						l.add(a[j]+","+a[x]);
					}
					else if(a[x]<=a[j] && (a[x]+a[j])%k==0 && !(l.contains(a[x]+","+a[j]))) {
						l.add(a[x]+","+a[j]);
					}
				}
			}
			
			s+="Case "+i+": "+l.size()+"\n";
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
System.out.println(s);
	}

}
