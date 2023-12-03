package heranca.nullobject;

public class CookieFactory {
	
	public static Carrinho createCarrinho(String type) {
		switch(type) {
			case "null":
				return null;
				
			case "default":
				return new CarrinhoNulo();
		}
		
		return null;
	}
}
