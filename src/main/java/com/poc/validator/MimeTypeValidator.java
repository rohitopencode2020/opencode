package com.poc.validator;

import org.apache.tika.Tika;
import org.springframework.web.multipart.MultipartFile;

import com.poc.utils.CustomMimeTypes;

import net.sf.jmimemagic.Magic;
import net.sf.jmimemagic.MagicMatch;

public class MimeTypeValidator {
	Tika tika = new Tika();
	String mimeType = null;
	String xxx = null;
	public Boolean validate(MultipartFile file) {
		// From inside the file
		try {
			MagicMatch match = Magic.getMagicMatch(file.getBytes());
			System.out.println("xxxxxxxxxxxxxxxxx" + match.getMimeType());
			mimeType = tika.detect(file.getBytes());
			System.out.println("internal mime type" + mimeType);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

		CustomMimeTypes vv = new CustomMimeTypes();
		String xx = CustomMimeTypes.lookupExt(mimeType);
		System.out.println("xx" + xx);

		// from user input
		String fileName = file.getOriginalFilename();


		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			xxx = fileName.substring(fileName.lastIndexOf(".") + 1);
		}
		System.out.println("lastIndex8888  " + xxx);

		System.out.println("xx-->" + xx);
		System.out.println("yy-->" + mimeType);

		if (!xx.equalsIgnoreCase(xxx)) {
			// errors.rejectValue("file", "upload.invalid.file.type");
			return false;
		}

		return true;

	}

}
