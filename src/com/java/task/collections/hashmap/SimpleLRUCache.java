package com.java.task.collections.hashmap;

import java.util.LinkedHashMap;

public class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {

	private final int capacity;
	
	public SimpleLRUCache(int capacity) {
		super(capacity + 1, 1.1f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return this.size() > capacity;
	}
}
