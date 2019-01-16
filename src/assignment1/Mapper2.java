package assignment1;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mapper2 {
	static Scanner file;

	public List<Pair2> map(String filePath) {
		try {
			file = new Scanner(new FileReader(filePath));
		} catch (Exception e) {			
			e.printStackTrace();
		}

		List<Pair2> words = new LinkedList<>();
		
		while (file.hasNext()) {	
			String word = file.next();
			if(word.matches("[a-zA-Z-]+")) {
				String[] keys = word.split("-");
				for(int i = 0; i < keys.length; i++) {
					if(!keys[i].trim().isEmpty()) {
						Pair2 pair = new Pair2(keys[i].toLowerCase(), 1);
						words.add(pair);
					}
				}
				
				
			}			
		}
		file.close();
		
		List<Pair2> pairs = words.stream().sorted().collect(Collectors.toList());
		
		pairs.forEach(p -> System.out.println("(" + p.getKey() + ", " + p.getValue() + ")"));
		
		return pairs;
	}
}
