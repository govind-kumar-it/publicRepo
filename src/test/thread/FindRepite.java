package test.thread;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRepite {
	public static void main(String[] args) {
		String s="aa dd afa afa ee ww aa dd";
		String [] ar=s.split(" ");
		List<String> list= Arrays.asList(ar);
		Set<String> set= new HashSet<>(list);
		for(String w:set)
			System.out.println(w +" "+ Collections.frequency(list,w));
	}

}
