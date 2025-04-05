package example;


class Parent {
	void show() {
		System.out.println("Parent 클래스");
	}
}
class Child extends Parent {
	void show() {
		System.out.println("Child 클래스");
	}
}	

public class JavaTest {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.show();
		
	}
}
