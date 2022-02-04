package Patterns;

import java.util.Scanner;

//*********
// ******* 
//  *****  
//   ***   
//    * 
public class Pattern8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n-1 ; i >= 0 ; i--)
		{
			for(int j = 0 ; j <= 2*(n-1) ; j++)
			{
				if(j >= (n-1-i) && j-i <= (n-1) )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
