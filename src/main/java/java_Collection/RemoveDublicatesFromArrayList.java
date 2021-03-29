package java_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicatesFromArrayList {

	public static void main(String[] args) {
		
		//1 way of removing dublocAte elements from arraylist
		ArrayList<Integer> nummbers = new ArrayList<Integer>();
		nummbers.add(1);
		nummbers.add(1);
		nummbers.add(1);
		nummbers.add(2);
		nummbers.add(2);
		nummbers.add(3);
		nummbers.add(4);
		nummbers.add(5);
		nummbers.add(6);
		nummbers.add(7);
		nummbers.add(8);
		nummbers.add(9);
		nummbers.add(10);
		nummbers.add(1);
        LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>(nummbers);
		ArrayList<Integer> nummber = new ArrayList<Integer>(hashset);
		System.out.println(nummber);
		
		
		
		//2 way of removing dublocAte elements from arraylist
		ArrayList<Integer> markss = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,6,7,2,8,2,9,9,9,9,10,10,10,11));
		LinkedHashSet<Integer> marks = new LinkedHashSet<Integer>(markss);
		ArrayList<Integer> marksss = new ArrayList<Integer>(marks);
		System.out.println(marksss);
		
		
		//3 way of removing dublocAte elements from arraylist
		ArrayList<Integer> numeric = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,6,7,2,8,2,9,9,9,9,10,10,10,11));
		List<Integer> num =  numeric.stream().distinct().collect(Collectors.toList());
		System.out.println(num);
		
	}

}
