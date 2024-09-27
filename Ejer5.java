package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejer5 {
	public static void main(String[] args) {
		
		String command = "cmd /c tasklist | findstr Notepad.exe";

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;

				line = br.readLine();
		
				if(line != null) {
					System.out.println("Notepad esta ejecutando");
					process = Runtime.getRuntime().exec("cmd /c taskkill /im notepad.exe");
					
				}else {
					System.out.println("Notepad no esta en ejecucion");
				}
			
			br.close();
			process.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
