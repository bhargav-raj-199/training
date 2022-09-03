package com.csv.main;

import com.csv.service.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="D:/eclipse workspace/Employee.csv";
		CSVService service=new CSVServiceImpl();
		service.saveToDb(filename);
		
		

	}

}
