package com.bean;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class CollectionsList {

  /*CollectionsList(Enumeration<T) returns list as an output when 
  *takes Enumeration of type T
  */
  
	public static void main(String[] args) {
		/*
		 * Collections.indexOfSubList(sourceList,targetList)\
		 * used to find the first occurence  of a  specified sublist 
		 * within  a larger list.It returns the start index of the targetList
		 * within the sourceList
		 * 
		 */
		Vector<String> vector=new Vector<>();
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");
		Enumeration<String> enumeration=vector.elements();
		List<String> listFromEnumeration=Collections.list(enumeration);
		System.out.println("List from enumeration"+listFromEnumeration);
		}
		
	}
