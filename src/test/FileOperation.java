package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation extends FileUtils {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Jamal\\Downloads\\file class\\java.doc");

//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		boolean b = f.isFile();
		System.out.println(b);
		
		write(f, "It's Working!, before first it throws error because, I've pasted the .jar file in the Src but didn't build the path");
		write(f, "\nSince,write is a static method in the class File,", true);
		write(f, "\nwe can call a static method directly without using the className.", true);

		List<String> r = readLines(f);
		for (String li : r) {
			System.out.println(li);
		}
	}
}