package Programmers;

public class StrToInt {

	public int getStrToInt(String str) {
		int toInt = Integer.parseInt(str);
		return toInt;
	}

	public static void main(String[] args) {
		StrToInt strToInt = new StrToInt();
		System.out.println(strToInt.getStrToInt("-1234"));
	}
}
