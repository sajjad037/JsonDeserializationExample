package com.tavl.Utilities;

import java.lang.reflect.Type;

import com.google.gson.Gson;

public class Conversion {

	public Object getObjectFromJson(String jsonString, Class<?> _class) {
		Gson gson = new Gson();
		return gson.fromJson( jsonString, _class);
	}
	
	public Object getObjectFromJson(String jsonString, Type typeOfT) {
		Gson gson = new Gson();
		return gson.fromJson (jsonString, typeOfT);
	}
	
	public String getJsonFromObject(Object object) {
		Gson gson = new Gson();
		return gson.toJson(object);
	}
	

}
