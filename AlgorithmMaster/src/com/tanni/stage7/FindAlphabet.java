//#10809
package com.tanni.stage7;
import java.util.Scanner;
import java.util.ArrayList;

public class FindAlphabet {
	public static void main(String[] args) {
		
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
				"q","r","s","t","u","v","w","x","y","z"};
		ArrayList find_result = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for(int i = 0; i<alphabet.length; i++) {
			if(word.contains(alphabet[i])) {
				int location = word.indexOf(alphabet[i]);
				find_result.add(location);
			}
			else {
				find_result.add(-1);
		}
		}
		for(int i = 0; i<find_result.size(); i++) {
			System.out.print(find_result.get(i));
			System.out.print(" ");
		}
	}
}
