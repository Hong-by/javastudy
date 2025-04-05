package example;

public class for_each_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Java", "for-each", "array", "loop"};
		
		int totalLength = 0;
		
		for(String word : words) {
			totalLength += word.length();
		}
		System.out.println("총 글자 수 : " + totalLength);
	}
	

}
