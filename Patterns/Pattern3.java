package Patterns;

import java.util.Scanner;

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= n ; j++)
			{
				if(j <= i)
				{
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}

	}

}
