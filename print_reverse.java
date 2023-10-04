/*
Take N as input, Calculate it's reverse also Print the reverse.

Input Format
Constraints
0 <= N <= 1000000000

Output Format
Sample Input
123456789
Sample Output
987654321
*/

import java.util.*;
public class print_reverse {
    public static void main(String args[]) {
        int rev=0,N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		while(N>0){
			rev=(rev*10)+(N%10);
			N/=10;
		}
		System.out.print(rev);
    }
}
