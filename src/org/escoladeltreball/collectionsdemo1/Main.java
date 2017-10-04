/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author iaw47941842
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		
		list.remove("Bravo");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);			
		}
		
		
		
		
		
	}

}
