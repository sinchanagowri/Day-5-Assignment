import java.util.*;
public class Pairgivingsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k=s.nextInt();
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]+a[j]==k) {
					System.out.printf("(%d"+","+"%d)", a[i],a[j]);
				}
			}
		}

	}

}

/*python
l=[1,3,4,2]
k=5
for i in l:
    if (k-i) in l:
        print(i,(k-i);*/