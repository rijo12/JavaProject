package rocketAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
	
	ArrayList<Item> array = new ArrayList<Item>();

	ArrayList<Item> loadItems() throws FileNotFoundException{
		
		File file=new File("C:\\Users\\venit\\OneDrive\\Desktop\\phase-1.txt");
		
		String inputValues;
		
		String[] nameWeight;
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			
			inputValues= sc.nextLine();
			
//			System.out.println(inputValues.toString());
			
			nameWeight= inputValues.split("=",2);
			
//			System.out.println(nameWeight[0]);
			
			Item item = new Item(nameWeight[0], Integer.parseInt(nameWeight[1]));
					
			array.add(item);
			
			
		}
		return array;
		
	
		
		}
	
	ArrayList<R1> loadU1(){
		
		R1 RocketOne = new R1();
			
		for(Item listWeight:array) {
			
			if(RocketOne.canCarry(listWeight)) {
				
				RocketOne.carry(listWeight);
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		return null;
		
		
		
		
		
		
	}
	
	
	
	}
	
	
	

