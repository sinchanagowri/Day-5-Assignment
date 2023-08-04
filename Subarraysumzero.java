import java.util.Scanner;

public class Subarraysumzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=s.nextInt();
	    }
	    s.close();
	    int maxlen=0;
	    for(int i=0;i<size;i++) {
	    	int curr=0;
	    	for(int j=i;j<size;j++) {
	    		curr+=arr[j];
	    	
	    	if(curr==0) {
	    		maxlen=Math.max(maxlen, j-i+1);
	    	}
	    }

	}
	    System.out.println(maxlen);

}
}
