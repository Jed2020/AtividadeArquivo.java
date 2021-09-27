package jed2020.github.com.projeto.arquivo;

public class programa {
	
	public static void main(String[] args) {
		
		EscreveArquivo e1 = new EscreveArquivo(1, "Antonio", "antonio@gmail.com", "11111");
		EscreveArquivo e2 = new EscreveArquivo(2, "Clara", "clara@gmail.com", "11112");
		EscreveArquivo e3 = new EscreveArquivo(3, "Antonia", "antonia@gmail.com", "11113");
		
		LerArquivo.insereDado(e1);
		LerArquivo.insereDado(e2);
		LerArquivo.insereDado(e3);
		
		
		LerArquivo.escreveDado();
		
		//System.out.println("Dado removido");
		//LerArquivo.removeDado("11112");
		
		LerArquivo.escreveDado();
		//LerArquivo.gravaDado();
		LerArquivo.lerDado();
		LerArquivo.escreveDado();
	}

}
