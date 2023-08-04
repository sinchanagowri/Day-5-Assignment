import java.util.Scanner;
public class Arrayshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		str=s.nextLine();
		int size=str.length();
		int shifts[]=new int[size];
		for(int i=0;i<size;i++) {
			shifts[i]=s.nextInt();
		}
		for (int i = size - 2; i >= 0; --i)
            shifts[i] += shifts[i + 1];
       
        // finding the new shifted string
        String result = "";
       
        // traverse str and shift letters according to shift array
        for (int i = 0; i < str.length(); i++) {
       
            // For upper letters
            if (Character.isUpperCase(str.charAt(i))) {
                result += (char)(((int)(str.charAt(i)) + shifts[i] - 'A') % 26 + 'A');
            }
       
            // For lower letters
            else if (Character.isLowerCase(str.charAt(i))) {            
                result += (char)(((int)(str.charAt(i)) + shifts[i] - 'a') % 26 + 'a');
            }
       
            // For digits
            else {            
                result += (char)(((int)(str.charAt(i)) + shifts[i] - '0') % 10 + '0');
            }
        }
       
        // Return the shifted string
        System.out.print(result);
		

	}

}



/*Shifting Letters says that we have given a string s and an array shifts.
Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times. We have to return the
final string after all shifts are applied.
:
: s = “abc”, shifts = [3,5,9]
:”rpl”
:We start with “abc”.
After Shifting the first 1 letter of s by 3, we have “dbc”.
After shifting the first 2 letters of s by 5, we have “igc”.
After shifting the first 3 letters of s by 9, we have “rpl”.
Hence “rpl” is our final answer.*/