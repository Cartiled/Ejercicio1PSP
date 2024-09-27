package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ejer7 {

	public static void main(String[] args) {
		
		try {
			ProcessBuilder builder = new ProcessBuilder("java","ejercicio1.EjemploLectura");
			builder.directory(new File("bin"));
			Process process=builder.start();
			
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				break;
			}
			process.waitFor();
			
		} catch (Exception e) {
				
			e.printStackTrace();
		}
	}
}
