/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author iaw47941842
 *
 */
public class Main {
	
	public static List<String> subLlista(List<String> list, String expressio) {
		
		List<String> subLlista = new LinkedList<>();
		
		for (String string : list) {
			if (string.startsWith(expressio)) {
				subLlista.add(string);
			}
			
		}		
		return subLlista;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>(); 		
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		list.add("Alava");
		list.add("Albacete");
		
		
		list.remove("Bravo");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);			
		}
		
		List<String> result = subLlista(list, "Al");
		
		System.out.println("-----SUBLISTA----");
		
		for (String string : result) {
			System.out.println(string);			
		}
		
		
		
		
		
	}

}
