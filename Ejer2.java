package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer2 {
		
	public static void main(String[] args) {
		String cmd = "cmd /c dir";
		
		try {
			Process process = Runtime.getRuntime().exec(cmd);
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"gbk");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
