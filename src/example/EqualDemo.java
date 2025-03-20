package example;

public class EqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// == 같은 면 true, 다르면 false
		System.out.println(1==2); //false
		System.out.println(1 == 1); // true
		System.out.println("one"=="one"); //true
		
		// !는 not을 의미함
		System.out.println(1!=2); //true
		
		// >< >= <= 는 생략하겠음
		
		//문자열은 .equals을 사용해야한다
		String a ="Hellow World";
		String b = new String("Hellow World");
		System.out.println(a == b); //false
		System.out.println(a .equals(b)); //true
		
	}

}
