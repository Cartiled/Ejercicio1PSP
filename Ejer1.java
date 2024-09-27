package ejercicio1;

public class Ejer1 {
	public static void main(String[] args) {
		System.out.println("Vamos a lanzar el Notepad...");
		
		String [] infoProceso = {"notepad.exe"};
		try {
			Process proceso = Runtime.getRuntime().exec(infoProceso);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
