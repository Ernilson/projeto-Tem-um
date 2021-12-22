package br.com.teste.model;

public class ProdutosModel {
	
	private String name;
	private Double price;
	
	public ProdutosModel() {
		// TODO Auto-generated constructor stub
	}

	public ProdutosModel(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
