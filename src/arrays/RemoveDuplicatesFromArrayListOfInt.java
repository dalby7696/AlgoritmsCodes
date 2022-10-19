package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayListOfInt {
	
	
	
	
	public static void main(String args[]) {
		   
        //ArrayList with duplicates String
        List<Integer> duplicateList = (List<Integer>) Arrays.asList(1, 2, 3, 5,4,7,3,2,1,6);
       
        //should print 4 because of duplicates Android
        System.out.println("size of Arraylist with duplicates: " + duplicateList.size());      
        System.out.println("ArrayList with duplicates: " + duplicateList);
     
        //Converting ArrayList to LinkedHashSet to remove duplicates
        LinkedHashSet<Integer> listToSet = new LinkedHashSet<Integer>(duplicateList);
     
        //Creating Arraylist without duplicate values
        List<Integer> listWithoutDuplicates = new ArrayList<Integer>(listToSet);

        //should print 3 because of duplicates Android removed
        System.out.println("size of ArrayList without duplicates: " + listToSet.size());
        System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);
     
     
    }

}
