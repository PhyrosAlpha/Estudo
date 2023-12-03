package heranca.nullobject;

public class CarrinhoNulo extends Carrinho {
	
	@Override
	public Double getValor() {
		return 0.0;
	}
	
	@Override
	public Long getTamanho() {
		return Long.valueOf(0);
	}
	
	@Override
	public String getNomeUsuario() {
		return "An�nimo";
	}

}
