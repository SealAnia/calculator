package org.example.calculator.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.example.calculator.calculator.MathOperation;

public class Calculator {
	
	public static String rewrite(String str) {
		for(MathOperation value : MathOperation.values()) {
			if(str.contains(value.getKeyword())) {
				str = str.replace(value.getKeyword(), value.getSign()).replace(" ", "");
			}
		}
		return str;
	}
	
	public static String generateExercise(String filename) {
		byte[] buffer = null; 
		try (FileInputStream fis = new FileInputStream(filename)) {
			int size = fis.available();
			buffer = new byte[size];
			fis.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder b = new StringBuilder();
		String text = new String(buffer);
	    Pattern pattern = Pattern.compile("apply.+.");
	    Matcher matcher = pattern.matcher(text);
	    while (matcher.find()) {
	    	String str1 = text.substring(matcher.start(), matcher.end());
	    	b.append(str1);
	    	text = text.replace(str1, "");
	    	b.append(text);
	    }
	    return rewrite(b.toString());
	}
	
}
