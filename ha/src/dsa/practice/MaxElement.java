package dsa.practice;
import java.util.HashMap;
import java.util.Scanner;

public class MaxElement {
	public static HashMap<String,String> dictionary=new HashMap<>() {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		dictionary.put("Banana", "It is a fruit");
		dictionary.put("Apple", "It is a yummy fruit");
		dictionary.put("Banana", "It is a yellow fruit");
		while(true) {
			System.out.println("++++++++++++++++++++++++");
			System.out.println("1. Lookup Word");
			System.out.println("2. Add Word");
			System.out.println("3. List of words with destination");
			System.out.println("4. exit");
		}
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.println("++++++++++++++++++++++++");
			
			switch(choice) {
			case 1:{
				lookup();
				break;
			}
			case 2:{
				AddWord();
				break;
			}
			case 3:{
				for(String words:dictionary.keySet()) {
					System.out.println(words+": "+dictionary.get(words));
				}break;
			}
			case 4:{
				System.out.println("Have a Good Day");
				return;
			}
			default:{
				System.out.println("Please Enter valid value");
			}		}	}}
	private static void lookup() {
		System.out.println("Enter word");
		String word = sc.nextLine();
		if(dictionary.containsKey(word)) {
			System.out.println(word + "="+dictionary.get(word));}
		else {
			System.out.println("word doesn't exists in dict");
			Suggestword(word);
		}		
	}
	private static void Suggestword(String ptword) {
		System.out.println("Suggetion");
//		String word = sc.nextLine();
		for(String words:dictionary.keySet()) {
			if(words.startsWith(ptword)) {
				System.out.println(words + " ");
			}
			System.out.println();
		}
	}
	private static void AddWord() {
		// TODO Auto-generated method stub
		System.out.println("Enter word");
		String word = sc.nextLine();
		if(dictionary.containsKey(word))
			System.out.println("Sorry the Word is already exist");
		else {
			System.out.println("Enter Definition");
			String def = sc.nextLine();
			dictionary.put(word, def);
		}
	}
}