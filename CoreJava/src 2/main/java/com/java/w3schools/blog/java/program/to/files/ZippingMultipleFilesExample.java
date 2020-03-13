package com.java.w3schools.blog.java.program.to.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZippingMultipleFilesExample {

	public static void main(String[] args) throws IOException {

		// src file
		String sourceFile = "src-file.txt";

		// compressed file name
		FileOutputStream fos = new FileOutputStream("compressed.zip");

		System.out.println("File compression started.");
		// output zip file stream.
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		File fileToZip = new File(sourceFile);
		FileInputStream fis = new FileInputStream(fileToZip);

		// Creating zip file name.
		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		zipOut.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;

		// writing content into zip or archieve file.
		while ((length = fis.read(bytes)) >= 0) {
			zipOut.write(bytes, 0, length);
		}
		zipOut.close();
		fis.close();
		fos.close();
		System.out.println("Done");
	}

}
