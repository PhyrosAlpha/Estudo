package heranca.hookmethod.templatemethod;

public class TemplateMethodConcretoA extends TemplateMethodAbstrato {
	
	private int numberC;
	
	

	public TemplateMethodConcretoA(int numberA, int numberB, int numberC) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.numberC = numberC;
	}

	@Override
	protected void hookMethod() {
		System.out.println("Template Method A");
		System.out.println("NumberA + NumberB + NumberC = " + (numberA + numberB + numberC));
		
	}

}
