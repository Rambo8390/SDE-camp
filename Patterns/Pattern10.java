package Patterns;

import java.util.Scanner;

//* * * * *
// * * * * 
//  * * *  
//   * *   
//    *   
public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n-1 ; i >= 0 ; i--)
		{
			for(int j = 0 ; j <= 2*(n-1) ; j++)
			{
				if(j >= (n-1-i) && j-i <= (n-1) )
				{
					if((i%2 == 1 && j%2 == 0) || (i%2 == 0 && j%2 == 1))
					{
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
