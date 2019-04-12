package javaInterview;

public class extractWordsFromAString
{

	public static void main(String[] args)
	{
		String str = "I am going home";
		
		String[] words = str.split(" ");
		
		//for(String eachWord:words)
			
		for(int i=0; i<words.length; i++)
		
			System.out.println(words[i]);
		
	}
}


