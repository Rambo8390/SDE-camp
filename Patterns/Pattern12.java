package Patterns;

import java.util.Scanner;

//   1   
//  212  
// 32123 
//4321234
// 32123 
//  212  
//   1
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			int k = i+1;
			for(int j = 0 ; j <= 2*(n-1) ; j++)
			{
				if(j >= (n-1-i) && j-i <= (n-1) )
				{
					if(j < n-1)
					{
						System.out.print(k);
						k--;
					}
					else {
						System.out.print(k);
						k++;
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = n-2 ; i >= 0 ; i--)
		{
			int k = i+1;
			for(int j = 0 ; j <= 2*(n-1) ; j++)
			{
				if(j >= (n-1-i) && j-i <= (n-1) )
				{
					if(j < n-1)
					{
						System.out.print(k);
						k--;
					}
					else {
						System.out.print(k);
						k++;
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
