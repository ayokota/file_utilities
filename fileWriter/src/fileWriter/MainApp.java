package fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MainApp {

	
	public static void file_write3(String content, String fileName, String filePath) {
		File file = new File(filePath + fileName);
		
		try {
			if (!file.exists()) 
				file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Path FILE_PATH = Paths.get(filePath, fileName);
		try (BufferedWriter writer = Files.newBufferedWriter(FILE_PATH, StandardCharsets.UTF_8, StandardOpenOption.APPEND)){
			writer.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		file_write3("\nhelloooooo\n", "./", "temp.txt");

	}
}
