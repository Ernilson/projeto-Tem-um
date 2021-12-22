package br.com.teste.model;

public class OrdemItem {
	
	private Integer quantidade;
	
	private Double price;
	
	private ProdutosModel produto;
	
	public OrdemItem() {
		// TODO Auto-generated constructor stub
	}

	public OrdemItem(Integer quantidade, Double price, ProdutosModel produto) {
		super();
		this.quantidade = quantidade;
		this.price = price;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProdutosModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutosModel produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return price * quantidade;
	}
	
	@Override
	public String toString() {
		return getProduto().getName()
				+ ", $"
				+ String.format("%.2f",price)
				+", Quantidade: "
				+ quantidade
				+ ", SubTotal: $"
				+ String.format("%.2f", subTotal());
	}
	
	

}
