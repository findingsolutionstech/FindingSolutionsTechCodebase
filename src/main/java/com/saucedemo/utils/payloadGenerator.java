package com.saucedemo.utils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class payloadGenerator {
	
	
	
	public static String generateStringPayload(String fileName) throws IOException {
		String filePath = System.getProperty("user.dir")+ "//src//test//java//" + fileName;
		return new String(Files.readAllBytes(Paths.get(filePath)));
	}
	

}
