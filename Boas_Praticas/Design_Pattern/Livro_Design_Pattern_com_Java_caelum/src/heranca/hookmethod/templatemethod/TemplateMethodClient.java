package heranca.hookmethod.templatemethod;

public class TemplateMethodClient {

	public static void main(String[] args) {
		TemplateMethodAbstrato concreto = new TemplateMethodConcretoA(2, 3, 6);
		concreto.metodoPrincipal();
		
		concreto = new TemplateMethodConcretoB(5, 5, 5);
		concreto.metodoPrincipal();
		
	}
	
	
}
