package assignment1;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GenericMain {
		static Scanner file;

		public static void main(String[] args) {
			try {
				file = new Scanner(new FileReader("input/testDataForW1D1.txt"));
			} catch (Exception e) {			
				e.printStackTrace();
			}

			List<GenericPair<String, Integer>> words = new LinkedList<>();
			
			while (file.hasNext()) {	
				String word = file.next();
				if(word.matches("[a-zA-Z-]+")) {
					String[] keys = word.split("-");
					for(int i = 0; i < keys.length; i++) {
						if(!keys[i].trim().isEmpty()) {
							GenericPair<String, Integer> pair = new GenericPair<String, Integer>(keys[i].toLowerCase(), 1);
							words.add(pair);
						}
					}
					
					
				}			
			}
			file.close();
			
			List<GenericPair<String, Integer>> pairs = words.stream().sorted().collect(Collectors.toList());
			
			pairs.forEach(p -> System.out.println("(" + p.getKey() + ", " + p.getValue() + ")"));
		}
	}
