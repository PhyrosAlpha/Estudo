package heranca.nullobject;

public class Carrinho {
	
	private Double valor;
	private Long tamanho;
	private String nomeUsuario;
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setTamanho(Long tamanho) {
		this.tamanho = tamanho;
	}
	
	public Long getTamanho() {
		return tamanho;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	@Override
	public String toString() {
		return "Carrinho [valor=" + getValor() + ", tamanho=" + getTamanho() + ", nomeUsuario=" + getNomeUsuario() + "]";
	}
	
	

}
