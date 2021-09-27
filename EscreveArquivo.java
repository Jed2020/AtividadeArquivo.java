package jed2020.github.com.projeto.arquivo;

public class EscreveArquivo {
	
	private Integer id;
	private String nome;
	private String email;
	private String ra;
	
	public EscreveArquivo(Integer id, String nome, String email, String ra) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.ra = ra;
	}
	
	public EscreveArquivo(String lineFile) {
		String [] data = lineFile.split(";");
		this.id = Integer.parseInt(data[0]);
		this.nome = data[1];
		this.email = data[2];
		this.ra = data[3];
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + id + "\n");
		sb.append("Nome: " + nome + "\n");
		sb.append("Email: " + email + "\n");
		sb.append("RA: " + ra + "\n");
		return sb.toString();
	}
	
	public String toFile() {
		StringBuilder sb = new StringBuilder();
		sb.append(id + ";");
		sb.append(nome + ";");
		sb.append(email + ";");
		sb.append(ra + ";" + "\n");
		return sb.toString();
	}
}
