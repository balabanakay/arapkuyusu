package org.balaban.util;

import java.util.ArrayList;

public class CustomMapImpl <K,V> implements CustomMap<K,V>{
	
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	private int size =0;
	private int index =0;
	
	public ArrayList<K> getKeys(){
		if (null == this.keys){
			this.keys = new ArrayList<K> ();
		}
		return this.keys;
	}
	
	public ArrayList<V> getValues(){
		if (null == this.values){
			this.values = new ArrayList<V> ();
		}
		return this.values;
	}
	
	public Boolean contains(K key){
		return this.getKeys().contains(key);
	}
	
	public V getValue(K key) throws Exception{
		int myIndex =0;
		if (this.size == 0){
			throw new Exception("The map cannot be empty");
		}else if (!this.getKeys().contains(key)){
			throw new Exception ("The Map does not contain key Value");
		}else {
			for (K myKey : this.getKeys()){
				int t = 0;
				if (myKey == key){
					myIndex = t;
				}
			}
		}
		
		return this.values.get(myIndex);
	}
	
	public void put (K key, V value) throws Exception{
		if (this.getKeys().contains(key)){
			throw new Exception("The key is already in the map");
		}
		this.getKeys().add(key);
		this.getValues().add(value);
		this.size ++;
		this.index++;
	}
	

}
