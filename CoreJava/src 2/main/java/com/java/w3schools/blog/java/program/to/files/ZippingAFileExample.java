package com.java.w3schools.blog.java.program.to.files;

/**
 * 
 * Java Program to compress a multiple files at a time.
 * 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZippingAFileExample {

	public static void main(String[] args) throws IOException {

		// storing the multiple files in arraylist
		List<String> srcFiles = Arrays.asList("file-1.txt", "file-2.txt", "file-3.txt");

		// output zipped file
		FileOutputStream fos = new FileOutputStream("multifilesCompressed.zip");

		System.out.println("Zipping started.");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		for (String srcFile : srcFiles) {

			File fileToZip = new File(srcFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			// Creating a zip entry.
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024];
			int length;
			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();
		System.out.println("Done");
	}

}
