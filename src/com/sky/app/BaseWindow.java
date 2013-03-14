package com.sky.app;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class BaseWindow extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseWindow(){
		ThemeManager.getInstance().addObserver(this);	
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		changeTheme();
	}
	
	public void changeTheme() {
		System.out.println(this.getTitle()+"----主题改变了");
	}
	
}
