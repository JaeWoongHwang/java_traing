package Programmers;

public class WordTranslation {

	public static void main(String[] args) {
		String answer = "try hello world";
		String[] word = answer.split("\\s");
		char[] array = new char[word.length];
		answer = "";
		
		for (int i = 0; i < word.length; i++) {
			// 스트링을 캐릭터로 변환
			array[i] = word[i].charAt(i);

			if (i % 2 == 0) {
				word[i] = String.valueOf(array[i]);
				word[i].toUpperCase();

			} else {
				word[i] = String.valueOf(array[i]);
				word[i].toLowerCase();

			}
			
			answer += word[i];
		}

		System.out.println(answer);

	}

}
