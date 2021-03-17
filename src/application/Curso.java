package application;

public class Curso {
	private String nomeCurso;
	private Double[] notas = new Double[5];
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public Double[] getNotas() {
		return notas;
	}
	
	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	
	public Double getNota(int index) {
		return notas[index];
	}
	
	public void setNota(int index, double valor) {
		this.notas[index] = valor;
	}
	
	public Double mediaNotas() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		
		return soma / notas.length;		
	}
	
	public Double maiorNota() {
		double maior = notas[0];
		for (int i = 1; i < notas.length; i++) {
			if (maior < notas[i]) {
				maior = notas[i];
			}
		}
		return maior;
	}
	
}
