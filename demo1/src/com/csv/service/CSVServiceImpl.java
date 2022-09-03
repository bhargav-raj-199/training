package com.csv.service;

import com.csv.bean.Employee;
import com.csv.dao.*;

import java.io.*;


public class CSVServiceImpl implements CSVService{

	@Override
	public void saveToDb(String filename) {
		// TODO Auto-generated method stub
		BufferedReader lineReader = null;
		 String lineText = null;
			try {
				lineReader = new BufferedReader(new FileReader(filename));
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				lineReader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       
			try {
				while ((lineText = lineReader.readLine()) != null) {
					String[] data = lineText.split(",");
				    String name = data[0];
				    String city = data[1];
				    int salary = Integer.parseInt(data[2]);
				    Employee employee=new Employee(name,city,salary);
				    CSVDao csvdao=new CSVDaoImpl();
				    csvdao.save(employee);
				}
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
 
        
 
	}


}
