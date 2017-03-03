package com.symphonycommerce.shorty;

import java.util.HashMap;
import java.util.Map;

public class ToImplement {
	
	private String slug="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private char chars[]= slug.toCharArray();
	private Map<String, String> m1 = new HashMap<String, String>();

	
	public String get(String shortURI) {
	
		  String longurl="";
		  longurl = m1.get(shortURI);
			return longurl;

	  }

	  public String set(String longURL) {
		  String shorturl ="";
		  String key="";
		  boolean flag= true;
		  
		  if ( m1.containsValue(longURL)) {
			  for(Object o : m1.keySet()){
				  if (m1.get(o).equals(longURL)) {
					  shorturl =  o.toString();
				  }
			  }
			 
			} else {
				while(flag){
					
				for(int k = 0; k<62; k++){
					key += chars[k];
					if(!m1.containsKey(key))
						{flag= false;
					break;}
					
					}
				}
				
				m1.put(key, longURL);
				shorturl = key;
			}
	    return shorturl;
	  }
	}
