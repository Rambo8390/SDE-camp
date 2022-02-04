package Patterns;

import java.util.Scanner;

//****
//
//*  *
//
//*  *
//
//*  *
//
//****
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0 ; i <= 2*n ; i++)
		{
			if(i == 0)
			{
				for(int j = 0 ; j < n ; j++)
				{
					
					System.out.print("*");
				}
				
			}
			else if(i == 2*n)
			{
				for(int j = 0 ; j < n ; j++)
				{
					
					System.out.print("*");
				}
			}
			else if(count == 2)
			{
				for(int j = 0 ; j < n ; j++)
				{
					if(j == 0 || j == n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				count = 0;
			}
			
			count++;
			System.out.println();
		}

	}

}
