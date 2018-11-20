import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Daniel Han
 * PD. 7
 */
public class GettysburgAddress
{
			public static void main(String[] args) throws FileNotFoundException
			{
				Scanner file = new Scanner(new File("GettysburgAddress.txt"));
				//assume filename stores the name of the file
				ArrayList<String> words = new ArrayList<String>();
				while (file.hasNext())
				{
					words.add(file.next());
				}
				String longestWord = words.get(0);
				for(String fileA : words)
				{
					if(longestWord.length() < fileA.length())
					{
						longestWord = fileA;
					}
				}
				System.out.println("The longest word of the Gettysburg Address is " + longestWord + " .");
				
			double sum = 0;
			for(String fileA : words)
			{
				sum+= fileA.length();
			}
			System.out.println("The average word length of the Gettysburg Address is " + sum/words.size() + " letters");
			}
			}
