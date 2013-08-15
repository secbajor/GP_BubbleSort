import java.util.Scanner;


public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean swapped = false; 
		int[] numbers = new int[6]; 
		
		int index = 0; 
		
		//get user input 
		while(index < numbers.length)
		{
			System.out.println("Input a value for number "+(index+1)+": "); 
			numbers[index]=input.nextInt(); 
			index++; 
			
		}
		
		//sort algorithm 
		do
		{
			swapped = false; 
			for(index = 0; index < (numbers.length -1); index++)
			{
				if(numbers[index] > numbers[index+1])
				{
					int temp = numbers[index+1]; 
					
					numbers[index+1]=numbers[index]; 
					numbers[index] = temp; 
					swapped = true; 
				}
			}
		}while(swapped == true); 
		
		//Print sorted array 
		for(index = 0; index<numbers.length; index++)
		{
			System.out.println(numbers[index]); 
		}

	}

}
