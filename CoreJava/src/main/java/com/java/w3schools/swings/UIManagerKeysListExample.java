package com.java.w3schools.swings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class UIManagerKeysListExample {

	public static void main(String[] args) {
		printUIManagerKeys();

	}

	public static void printUIManagerKeys() {
		UIDefaults defaults = UIManager.getDefaults();
		Enumeration keysEnumeration = defaults.keys();
		ArrayList keysList = Collections.list(keysEnumeration);
		for (Object key : keysList) {
			if (defaults.getString(key) != null) {
				System.out.println(key + " - " + defaults.getString(key));
			}
		}
		System.out.println(keysList.size());
		
	}

}
