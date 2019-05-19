package com.java.task.collections.hashmap;

public class LRUCacheApp {
	
	public static void main(String[] args) {
		SimpleLRUCache<Integer, String> simpleLRUCache = new SimpleLRUCache<>(2);
		simpleLRUCache.put(1, "One");
		simpleLRUCache.put(2, "Two");
		simpleLRUCache.put(3, "Three");
		
		simpleLRUCache.get(2);
		simpleLRUCache.put(9, "Nine");
		
		System.out.println(simpleLRUCache);
	}

}
