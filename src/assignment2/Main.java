package assignment2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Mapper m = new Mapper();
//		List<Pair<String, Integer>> m_output = m.map("input/testDataForW1D1.txt");
//		System.out.println("Mapper output:");
//		m_output.forEach(p -> System.out.println("(" + p.getKey() + ", " + p.getValue() + ")"));
//		System.out.println("===========================");
//		
//		Reducer r = new Reducer();
//		List<Pair<String, Integer>> r_output = r.reduce(m_output);	
//		System.out.println("Reducer output:");
//		r_output.forEach(p -> System.out.println("(" + p.getKey() + ", " + p.getValue() + ")"));
//		
		WordCount wc = new WordCount(3, 4);
		wc.execute();
	}

}
