package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer6 {

	public static void main(String[] args) {
		String fileRoute = "C:\\Trastero	\\ficheroBat.bat";
		String goodFile = "C:\\Trastero\\goodText.txt";
		String errorFile = "C:\\Trastero\\errorText.txt";
		
		try {
			ProcessBuilder process = new ProcessBuilder(fileRoute);
			process.redirectOutput(new File(goodFile));
			process.redirectError(new File(errorFile));
			Process pro = process.start();
			pro.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	}

}
