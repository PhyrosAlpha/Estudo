package heranca.hookmethod.templatemethod;

public class TemplateMethodConcretoB extends TemplateMethodAbstrato {
	
	private int numberD;
	
	

	public TemplateMethodConcretoB(int numberA, int numberB, int numberD) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.numberD = numberD;
	}

	@Override
	protected void hookMethod() {
		System.out.println("Template Method B");
		System.out.println("NumberA + NumberB + NumberD = " + (numberA + numberB + numberD));
		
	}

}
