package bankAccountApp;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class CSV {
	
	// reads data from csv file , and return as list 
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String datarow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			 
			while ((datarow = br.readLine()) != null){
			
			String[] datarecord = datarow.split(",");
			data.add(datarecord);
			}
			
		} catch (IOException e) {
			System.out.println("File not file");
			e.printStackTrace();
		}
		return data;
	}

}
