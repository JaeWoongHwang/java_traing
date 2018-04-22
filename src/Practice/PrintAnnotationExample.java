package Practice;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// Get methods from Service Class
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		// Handle Method instances one by one
		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				// Print name of Method
				System.out.println("[" + method.getName() + "]");
				// Print line
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					// Call Method
					method.invoke(new Service());
				} catch (Exception e) {
				}
				System.out.println();
			}
		}
	}

}
