package hu.codecool.christmasTree;

public class ChristmasTree {

	public String create(String text){
		StringBuilder result = new StringBuilder();
		int textLength = text.length();
		int maxLineLength = textLength * 2 - 1;
		
		for (int i = 0; i < textLength; i++) {
			StringBuilder line = new StringBuilder();
			for (int j = 0; j < maxLineLength; j++) {
				if (j < textLength - i - 1 || j > textLength + i - 1){
					line.append(' ');
				}
				else {
					line.append(text.charAt(i));
				}
			}
			result.append(line.toString() + "\n");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		ChristmasTree ct = new ChristmasTree();
		System.out.println(ct.create("Hello World!"));
	}
}
