package Patterns;

import java.util.Scanner;

//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0 ; i <= 2*(n-1) ; i++)
		{
			if(i < n)
			{
				for(int j = 0 ; j < n ; j++)
				{
					if(j<=i)
					{
						System.out.print("*");
					}
					
				}
			}
			else {
				
				for(int j = 0 ; j < n ; j++)
				{
					if(j <= (2*(n-1)-i) )
					{
						System.out.print("*");
					}
					
				}
				
			}
			
			System.out.println();
		}

	}

}
