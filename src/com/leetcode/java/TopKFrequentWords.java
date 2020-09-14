package com.leetcode.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequentWords {

	private static Map<String, Integer> map = new TreeMap<>();

	public static void main(String[] args) {
		String[] arr = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};//{ "i", "love", "leetcode", "i", "love", "coding" };
		int k = 2;
		List<String> topK = topKFrequent(arr, k);
		for(String element : topK) {
			System.out.println(">" + element);
		}
	}

	public static List<String> topKFrequent(String[] words, int k) {
		List<String> list = new ArrayList<String>();
		PriorityQueue<Word> topK = new PriorityQueue<>(words.length, new WordComparator());
		for (int i = 0; i < words.length; i++) {
			Integer value = map.get(words[i]);
			if (value != null) {
				map.put(words[i], ++value);
			} else {
				map.put(words[i], 1);
			}
		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			Word word = new Word(entry.getKey(), entry.getValue());
			topK.add(word);
		}
		k=topK.peek().getCount();
		for(Word element : topK) {
			if (k>0) {
				list.add(element.getWord());
				k--;
			}
		}
		return list;
	}
	
	static class WordComparator implements Comparator<Word> {

		@Override
		public int compare(Word w1, Word w2) {
			if (w1.count < w2.count) {
				return 1;
			} else if (w1.count > w2.count) {
				return -1;
			}
			return 0;
		}
		
	}

	static class Word {

		private String word;
		private int count;

		public Word(String word, int count) {
			super();
			this.word = word;
			this.count = count;
		}

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
	}

}
