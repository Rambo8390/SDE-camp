package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][2*(n-1)+1];
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j <= 2*(n-1) ; j++)
			{
				if(j >= (n-1-i) && j-i <= (n-1) )
				{
					if((i%2 == 1 && j%2 == 0) || (i%2 == 0 && j%2 == 1))
					{
//						
					}
					else {
						if(i == 0)
						{
							arr[i][j] = 1;
							continue;
						}
						
						int left = j==0 ? 0 : arr[i-1][j-1];
						int right = j==arr[0].length-1 ? 0 : arr[i-1][j+1]; 
						arr[i][j] = left + right;
					}
					
				}
				
			}
			
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[0].length ; j++)
			{
				if(arr[i][j] == 0)
				{
					System.out.print(" ");
				}
				else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
