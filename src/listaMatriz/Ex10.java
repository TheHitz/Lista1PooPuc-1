/*
 * Disciplina: Programação Orientada a Objetos
 * Aluno: João Pedro Lima
 */

import java.util.Scanner;

public class Ex10
{	
	static void printMatrix(int[][] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int newM[][] = new int[50][50];
		int diagM[][] = new int[50][50];
						
		// Create Matrix
		for (int row = 0; row < newM.length; row++)
		{
			for (int col = 0; col < newM[row].length; col++)
			{
				System.out.print("Valor [" + row + ", " + col + "]: ");
				newM[row][col] = in.nextInt();	
			}
		}	
		
		// Print Matrix
		System.out.println("\nMatriz original: ");
		
		for (int i = 0; i < newM.length; i++)
		{
			for (int j = 0; j < newM[i].length; j++)
			{
				System.out.print(newM[i][j] + " ");
			}
			System.out.println();
		}
		
		//Find Max Value		
		int max = 0;
		
		for (int row = 0; row < newM.length; row++)
		{
			for (int col = 0; col < newM.length; col++)
			{
				if (max < newM[row][col])
				{
					max = newM[row][col];
				}
			}
		}	
		
		System.out.println("\nMaior valor da matriz: " + max);
		System.out.println("\nNova matriz: ");
		
		//Main Diagonal
		for (int row = 0; row < newM.length; row++)
		{
			for (int col = 0; col < newM.length; col++)
			{
				if (row == col)
				{
					diagM[row][col] = max * newM[row][col];			
				}
				
				else
				{
					diagM[row][col] = newM[row][col];
				}
			}
		}
		
		printMatrix(diagM);
		
		System.out.println();
	}	
}
