package jed2020.github.com.projeto.arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerArquivo {

	private static ArrayList<EscreveArquivo> listaArquivo = new ArrayList <>();
	
	public static void insereDado(EscreveArquivo dado) {
		listaArquivo.add(dado);
	}
	
	public static void removeDado(String ra) {
		
	    int index = 0;
		for (EscreveArquivo d : listaArquivo) {
			if (d.getRa().equals(ra)) {
				listaArquivo.remove(index);
			}
			index++;
		}
	}
	
	public static void escreveDado() {
		for (EscreveArquivo d : listaArquivo) {
			System.out.println(d);
		}
	}
	
	public static void gravaDado() {
		
		try {
			File file = new File("registro-dados.txt");
			FileWriter fw = new FileWriter(file);
			
			for (EscreveArquivo d : listaArquivo) {
				fw.write(d.toFile());
			}
			fw.close();
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		    }
public static void lerDado() {
		
		try {
			File file = new File("registro-dados.txt");
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				EscreveArquivo d = new EscreveArquivo(scan.nextLine());		
				insereDado(d);
			}
			scan.close();			
			
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		    }
	    
}
