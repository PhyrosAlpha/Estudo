package heranca.nullobject;

public class NullObjectClient {

	public static void main(String[] args) {
		
		Carrinho carrinho;
		
		System.out.println("Carrinho default com pattern");
		carrinho = CookieFactory.createCarrinho("default");
		System.out.println(carrinho);
		
		System.out.println("Carrinho Null");
		carrinho = CookieFactory.createCarrinho("null");
		System.out.println(carrinho);
		System.out.println(carrinho.getNomeUsuario());

	}

}
