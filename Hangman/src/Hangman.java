import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
	public static void main(String[] args) {		
		System.out.println("Trwa uruchamianie programu");
		String word = selectword();		
//		System.out.println(word);
//		String c = hash(word);
//		System.out.println(c);
		System.out.println("Witaj w grze hangman "+"\n"+"Podaj literę:");
		boolean chec = false;
		int i=0;
		char[] tab = new char[11];
		while(chec = true){			
			Scanner scan = new Scanner(System.in);
			String l = scan.next();
			tab[i] = l.charAt(0);						
			i++;
			System.out.println(Arrays.toString(tab));
			String nw = chec(word, tab);
			System.out.println(nw);
			int j=11-i;
			System.out.println("Pozostało prób:"+j);
			if(nw.equals("*")){
				chec = true;
				System.out.println("Zgadłeś poprawne słowo to: "+word);
			} else if (i==11){
				System.out.println("Przegrałes, koniec gry prawidłowe słowo to: "+word);
			}			
		}
		System.out.println("Koniec gry");
	}
	
	public static String selectword(){		
		String word;
		int i=0;
		String[] tab = new String[5];
//		String[] tab2 = new String[tab.length];
		File file = new File("library.text");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()){
				tab[i]=scan.nextLine();
				i++;
			}
			Random r = new Random();
			int a = r.nextInt(tab.length);		
			word = tab[a];
			return word;
		} catch (FileNotFoundException e){
			return e.getMessage();
//			System.out.println(e.getMessage());
		}		
	}
	
	public static String hash(String word) {
		StringBuilder sb = new StringBuilder();
		char[] tab = new char[word.length()];
		for(int i=0; i<word.length(); i++){
			tab[i]='*';
			sb.append(tab[i]);
		}
		return sb.toString();
	}
	
	public static String chec(String word, char[] tab2) {
		StringBuilder sb = new StringBuilder();
		char[] tab = word.toCharArray();
		for(int i=0; i<word.length(); i++){
			boolean opt1=false;
			for(int j=0; j<tab2.length; j++){
				if(tab2[j]==(tab[i])){
					opt1=true;	
				}
			}
			if(opt1=true){
				sb.append(tab[i]);
			} else {
				sb.append("*");
			}
		}		
		return sb.toString();
	}
	
}
