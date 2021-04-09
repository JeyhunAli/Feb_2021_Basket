package java_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,3,4,5,5,5,6,6,7,8,9,10));
				
				LinkedHashSet<Integer> n1 = new LinkedHashSet<Integer>(num);
				ArrayList<Integer> nn = new ArrayList<Integer>(n1);
				System.out.println(nn);
		
				
				
				ArrayList<Integer> numers = new ArrayList<Integer>();
				numers.add(1);
				numers.add(1);
				numers.add(1);
				numers.add(2);
				numers.add(3);
				numers.add(1);
				numers.add(4);
				numers.add(4);
				numers.add(5);
				numers.add(6);
				numers.add(7);
				numers.add(8);
				
				List<Integer> n = numers.stream().distinct().collect(Collectors.toList());
				System.out.println(n);

				
	}

}