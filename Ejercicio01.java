import java.io.*;

public class Ejercicio01{
	public static void main (String args []){
		try{
			double dolar=20.0;
			BufferedReader br = new BufferedReader(new FileReader("Cantidad.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Resultado.txt"));
			String dato;
			while ((dato = br.readLine()) != null){
				double valor = Double.parseDouble(dato);
				double resultado = valor/dolar;
				String res = String.valueOf(resultado);
				bw.write(res + "\r");
				
			}
			br.close();
			bw.close();
			
		}catch(FileNotFoundException e){
			System.out.println("El archivo no existe...");
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		
		
	}
}