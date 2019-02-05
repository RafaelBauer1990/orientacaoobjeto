package com.target.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Principal {
	
	public static void main(String[] args) {
		
		List<Integer> listaNumerica = new ArrayList<Integer>();
		
		listaNumerica.add(15);
		listaNumerica.add(-25);
		listaNumerica.add(12);
		listaNumerica.add(9);
		listaNumerica.add(20);
		listaNumerica.add(45);
		listaNumerica.add(19);
		listaNumerica.add(74);
		listaNumerica.add(-45);
		listaNumerica.add(0);
		listaNumerica.add(0);
		listaNumerica.add(0);
		listaNumerica.add(1);
		listaNumerica.add(22);
		listaNumerica.add(1);
		listaNumerica.add(2);
		
		List<Integer> novaListaNumerica = new ArrayList<Integer>(listaNumerica);
		System.out.println(listaNumerica);
		System.out.println(novaListaNumerica);
		 Collections.reverse(listaNumerica);
		 
		 System.out.println(listaNumerica);
		 
		Collections.sort(listaNumerica);
		
		System.out.println(listaNumerica);
		
		System.out.println(listaNumerica.get(10));
		
		novaListaNumerica = new LinkedList<Integer>(novaListaNumerica);
		
		
		
		Iterator<Integer> inter = novaListaNumerica.iterator();
		
		LinkedList<Integer> novaNovaListaNumerica = new LinkedList<Integer>(novaListaNumerica);
		
		inter = novaNovaListaNumerica.descendingIterator();
				
		while (inter.hasNext()) {
			Integer elemento = inter.next();
			System.out.print(elemento + " - ");
		}
				
	}
}
		
		
		
		
		 
