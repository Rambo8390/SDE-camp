package Patterns;

import java.util.Scanner;

//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				if(j <= i)
				{
					System.out.print(k + " ");
					k++;
				}
				
			}
			System.out.println();
		}

	}

}
