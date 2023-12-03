package heranca.hookmethod.templatemethod;

public abstract class TemplateMethodAbstrato {
	
	protected int numberA;
	
	protected int numberB;
	
	

	
	public void metodoPrincipal() {
		this.printText();
		hookMethod();
	}
	
	protected abstract void hookMethod();
	
	private void printText() {
		System.out.println("E a soma é: ");
	}

}
