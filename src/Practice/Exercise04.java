package Practice;

public class Exercise04 {

	public static void main(String[] args) {
		boolean play = true;

		while (play) {
			int sco1 = (int) (Math.random() * 6) + 1;
			int sco2 = (int) (Math.random() * 6) + 1;

			if (sco1 + sco2 != 5) {
				continue;

			} else {
				System.out.println("(" + sco1 + "," + sco2 + ")");
			}
			play = false;

		}

	}
}
