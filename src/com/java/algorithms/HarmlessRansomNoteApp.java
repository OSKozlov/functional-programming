package com.java.algorithms;

import java.util.HashMap;
import java.util.Map;

public class HarmlessRansomNoteApp {

	public static void main(String[] args) {
		String[] noteText = "this is test".split(" ");
		String[] magazineText = "Maybe this is a simple test ?".split(" ");
		boolean result = harmlessRansomNote(noteText, magazineText);
		System.out.println(result);
	}
	
	private static boolean harmlessRansomNote(String[] noteText, String[] magazineText) {
		Map<String, Integer> magazineOccurence = new HashMap<String, Integer>();
		Map<String, Integer> noteOccurence = new HashMap<String, Integer>();
		
		for(String word: magazineText) {
			if (!magazineOccurence.containsKey(word)) magazineOccurence.put(word, 0);
				magazineOccurence.put(word, magazineOccurence.get(word)+1);
		}
		
		for(String word: noteText) {
			if (!noteOccurence.containsKey(word)) noteOccurence.put(word, 0);
				noteOccurence.put(word, noteOccurence.get(word)+1);
		}
		
		for(String key: noteOccurence.keySet()) {
			if (!magazineOccurence.containsKey(key)) return false;
			int needed = noteOccurence.get(key);
			if (magazineOccurence.get(key) < needed) return false; 
		}
		return true;
	}
}
