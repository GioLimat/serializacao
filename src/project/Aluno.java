package project;

import java.io.Serializable;

public class Aluno implements Serializable {

	private String nome;
	private int idade;
	private String matricula;
	private String curso;
	private String email;
	private double media;
	private transient String senhaPortal;

	public Aluno(String nome, int idade, String matricula, String curso, String email, double media, String senhaPortal) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.curso = curso;
		this.email = email;
		this.media = media;
		this.senhaPortal = senhaPortal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getSenhaPortal() {
		return senhaPortal;
	}

	public void setSenhaPortal(String senhaPortal) {
		this.senhaPortal = senhaPortal;
	}

	@Override
	public String toString() {
		return "Aluno{" +
				"nome='" + nome + '\'' +
				", idade=" + idade +
				", matricula='" + matricula + '\'' +
				", curso='" + curso + '\'' +
				", email='" + email + '\'' +
				", media=" + media +
				", senhaPortal='" + senhaPortal + '\'' +
				'}';
	}
}
