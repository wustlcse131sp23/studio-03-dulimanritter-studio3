package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please choose a number greater than 1 to start");

		int number = in.nextInt();
		boolean[] array = new boolean [number+1];	


		for (int i = 0; i <= number; i++) 
		{
			array [i] = true;
		}
		
		for (int i = 2; i<= Math.sqrt(number); i++)
		{
			if (array [i] == true)
			{
				for (int j = (i*i); j <= number; j = j+ i)
				{
					array [j] = false; 
				}
			}
		}
		
		for (int i = 2; i < array.length; i++)
		{
			if (array [i] == true){
			System.out.println(i);
			}
		}
			
	}
}