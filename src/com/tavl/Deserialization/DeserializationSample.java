package com.tavl.Deserialization;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.tavl.Domain.Message;
import com.tavl.Domain.MessageData;
import com.tavl.Utilities.Conversion;

public class DeserializationSample {

	public DeserializationSample() {
		// TODO Auto-generated constructor stub
	}

	static String jsonData = "";

	public static void main(String[] args) throws IOException {
		// Convert Json Sttring to Object
		jsonData = readFile("json.txt",StandardCharsets.UTF_8 );
		Message[] advanceObjectArray = (Message[]) (new Conversion()).getObjectFromJson(jsonData, Message[].class);
		List<Message> advanceObjectList = Arrays.asList(advanceObjectArray);
		int index = 0;
		for (Message message : advanceObjectList) {
			System.out.println("---------------------Record # "+(++index)+"--------------------");
			System.out.println("ObjectId : " +message.getObjectId());
			System.out.println("Number : " +message.getNumber());
			System.out.println("MessgeId : " +message.getId());
			System.out.println("Lat : " +message.getLatitude());
			System.out.println("Long : " +message.getLongitude());
			System.out.println("LandMark : " +message.getLandMark());
			System.out.println("Speed : " +message.getSpeed());
			
			System.out.println("---------------------Message Data--------------------");
			for (MessageData messageData : message.getMessageData()) {
				System.out.println("DataSourceName : " +messageData.getDataSourceName());
				System.out.println("DataSourceId : " +messageData.getDataSourceId());
				System.out.println("Value : " +messageData.getValue());
			}
			System.out.println("------------------------------------------------------");
		}

	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

}
