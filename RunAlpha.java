import java.util.Scanner;


public class RunAlpha {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean swapped = false; 
		String word; 
		char[] letters;  
		
		int index = 0; 
		
		//get user input 
		System.out.println("Input a value for the String: "); 
		word=input.next(); 
			
		letters = word.toCharArray();  
		
		
		//sort algorithm 
		do
		{
			swapped = false; 
			for(index = 0; index < (letters.length -1); index++)
			{
				if(letters[index] > letters[index+1])
				{
					char temp = letters[index+1]; 
					
					letters[index+1]=letters[index]; 
					letters[index] = temp; 
					swapped = true; 
				}
			}
		}while(swapped == true); 
		
		//Print sorted array 
		for(index = 0; index<letters.length; index++)
		{
			System.out.println(letters[index]); 
		}

	}

}
