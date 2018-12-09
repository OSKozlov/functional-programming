package com.java.patterns.nullobjectpattern;

public class NullObjectApp {

	public static void main(String[] args) {
		String[] OS = {"Windows","Ubuntu","Mac OS","Fake OS"};
		for(String title : OS) {
			System.out.println("OS title: " + OSFactory.createObject(title).getTitle());
		}
	}
}

abstract class AbstractOS {
	
	protected String title;
	
	public abstract String getTitle();
	public abstract boolean isNull();
}

class RealOS extends AbstractOS {
	
	public RealOS(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}

class NullOS extends AbstractOS {

	@Override
	public String getTitle() {
		return "not supported";
	}

	@Override
	public boolean isNull() {
		return true;
	}	
}

class OSFactory {
	
	private static final String[] OS = {"Windows","Ubuntu","Mac OS"};
	
	public static AbstractOS createObject(String title) {
		for(String eachOS : OS) {
			if (eachOS.equals(title)) {
				return new RealOS(title);
			}
		}
		return new NullOS();
	}
}