package Practice;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("Execution contents no.1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("Execution contents no.2");
	}

	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("Execution contents no.3");
	}
}
