package application;

public class Produtos {
	private Integer codProduto;
	private String nomeProduto;
	private Double[] precos = new Double[5];
	
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double[] getPrecos() {
		return precos;
	}
	public void setPrecos(Double[] precos) {
		this.precos = precos;
	}
	
	public Double getPreco(int index) {
		return precos[index];
	}
	
	public void setPreco(int index, double preco) {
		this.precos[index] = preco;
	}
	
	public Double maiorPreco() {
		double maior = precos[0];
		for (int i = 1; i < precos.length; i++) {
			if (maior < precos[i]) {
				maior = precos[i];
			}
		}
		return maior;
	}
	
	public Double menorPreco() {
		double menor = precos[0];
		for (int i = 1; i < precos.length; i++) {
			if (menor > precos[i]) {
				menor = precos[i];
			}
		}
		return menor;
	}
	
	public Double mediaPreco() {	
		double soma = 0;
		for (double preco : precos) {
			soma += preco;
		}
		
		return soma / precos.length;
	}
	
}
