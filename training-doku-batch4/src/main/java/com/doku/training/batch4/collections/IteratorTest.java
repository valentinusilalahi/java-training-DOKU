package com.doku.training.batch4.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: valentinussilalahi
 * Date: 2019-11-13
 * Time: 09:49
 * To change this template use File | Settings | File and Code Templates.
 */
public class IteratorTest {

public static void main(String[] args)
{
	List names = new LinkedList<String>();
	names.add("Rams");
	names.add("Posa");
	names.add("Chinni");
	
	// Getting Iterator
	Iterator<String> namesIterator = names.iterator();
	
	// Traversing elements
	while(namesIterator.hasNext()){
		System.out.println(namesIterator.next());
	}
	
}

	
	
	
}
