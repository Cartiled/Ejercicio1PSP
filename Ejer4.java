package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejer4 {
	public static void main(String[] args) {
		String command = "cmd /c tasklist";

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;

			List<String> runningPrograms = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				runningPrograms.add(line);
			}
			br.close();
			process.waitFor();
			for (String programs : runningPrograms) {
				System.out.println(programs);
			}
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
