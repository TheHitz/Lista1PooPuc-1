/* Disciplina: Programa��o Orientada a Objetos 
 * Aluno: Jo�o Pedro Lima
 */

import java.util.Scanner;

public class Ex01
{
	private static double rect()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Base do ret�ngulo: ");
		double a = in.nextDouble();
		
		System.out.print("Altura do ret�ngulo: ");
		double b = in.nextDouble();
		
		return a * b;
	}
	
	public static void main(String[] args)
	{		
		System.out.println("�rea do ret�ngulo � " + rect());
	}
}
