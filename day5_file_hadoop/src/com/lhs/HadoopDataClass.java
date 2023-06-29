package com.lhs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HadoopDataClass {

	ArrayList<String> datanames = new ArrayList<String>();
	Map<String, Integer> hadoops = new HashMap<String, Integer>();
	
	public HadoopDataClass() {
	
	}
	
	public void readDataName(String uri) {
		FileReader fr = null;
		BufferedReader br = null;
	
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String tmp = "";
			while((tmp = br.readLine()) != null)
				datanames.add(tmp);
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
	
	public void setData(String uri1, String uri2) {
		for (String s : datanames)
			hadoops.putIfAbsent(s, 0);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(uri2);
			br = new BufferedReader(fr);
			
			String tmp = "";
			String[] splits = null;
			while((tmp = br.readLine()) != null) {
				splits = tmp.split(" ");
				for (String s : splits) {
					for (String h : hadoops.keySet()) {
						if (s.contains(h))
							hadoops.computeIfPresent(h, (k, v) -> v + 1);
					}	
				}
			}
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

}
