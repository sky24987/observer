package com.sky.app;

public class AppDelegate {
	public static void main(String a[]){
		MailObserver mailObserver = new MailObserver();
		SmsObserver smsObserver = new SmsObserver();

		ThemeManager.getInstance().changeTheme();
		
	}
	
	
}
