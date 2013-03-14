package com.sky.app;

import java.util.Observable;

public class ThemeManager extends Observable{
	
	
	private static ThemeManager instance = new ThemeManager();
	
	private ThemeManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static ThemeManager getInstance() {
		return instance;
	}
	
	public void changeTheme() {
		super.setChanged();
		notifyObservers("数据改变了");
	}
	

}
