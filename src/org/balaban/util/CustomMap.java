package org.balaban.util;

import java.util.ArrayList;

public interface CustomMap<K, V> {

	public ArrayList<K> getKeys();
	public ArrayList<V> getValues();
	
	public Boolean contains(K key);
	public V getValue(K key) throws Exception;
	public void put (K key, V value) throws Exception;

}
