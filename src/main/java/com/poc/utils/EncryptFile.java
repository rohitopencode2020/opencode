package com.poc.utils;

import org.apache.commons.io.FilenameUtils;

public class EncryptFile {
	public String ChangeName(String FileName) {
		
		String fileNameWithOutExt = FilenameUtils.removeExtension(FileName);
		String Extension = FilenameUtils.getExtension(FileName);
		System.out.println(Extension);
		System.out.println(fileNameWithOutExt);

		String reverseStr = new StringBuffer(fileNameWithOutExt).reverse().toString();
		System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

		return reverseStr + "." + Extension;

	}

}
