package com.edu.test;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
/*
 * Map
 *  |
 *  Hashtable, HashMap
 *    |
 *    Properties
 *    (String key) - (String Value)
 *    
 * System 위에 탑재된 Java관련 환경변수값들을
 * 전부다...모조리...출력해보겠다.
 *    
 */
public class PropertiesTest4 {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		
		Set set= p.keySet();
		
		for(String key : p.stringPropertyNames()) {
			String value = p.getProperty(key);
			System.out.println(key +"=======" + value);
		}
			
//		Enumeration en= p.propertyNames();
//		
//		while(en.hasMoreElements()){
//			String key = (String)en.nextElement();
//			String value = p.getProperty(key);
//			System.out.println(key+ "========"+value);
//		}
		
	}
}
//Map에 저장된 키를 핸들링하는 가장 기본적인 것