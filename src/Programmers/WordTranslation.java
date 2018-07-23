package Programmers;

public class WordTranslation {

	public static void main(String[] args) {
		String answer = "try hello world";
		String[] word = answer.split("\\s");
		char [] array;
		for (int i = 0; i < word.length; i++) {
			// 스트링을 캐릭터로 변환
			array[i] = word[i].charAt(i);

			if (i % 2 == 0) {
				array[i].toUpperCase();
			} else {
				array[i].toLowerCase();
			}
		}

		// System.out.println(answer);

	}

}
