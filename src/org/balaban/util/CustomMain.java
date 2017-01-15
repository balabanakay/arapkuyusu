package org.balaban.util;

public class CustomMain {

	public static void main(String[] args) {
		
		CustomMap<String, String> myMap = new CustomMapImpl <String, String>();
		
		try {
			myMap.put("NL", "Netherlands");
			myMap.put("CA", "Canada");
			for (String key:myMap.getKeys()){
				System.out.println("[" + key + "] " + (String) myMap.getValue(key));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
