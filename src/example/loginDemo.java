package example;

public class loginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userId = args[0];
		String password = args[1];
		
		if(userId.equals("hby033")) {
			if(password.equals("1234")) {
				System.out.println("right");	
			} else {
				System.out.println("wrong");
			}
			
			
		} else {
			System.out.println("wrong");
		}
		
		
		//논리 연산사 사용 확인
		if(userId.equals("hby033") && password.equals("1234")) {
			System.out.println("right");
			
		} else {
			System.out.println("wrong");
		}
		
		//swich 현습
		switch(1) {
		case 1 :
			System.out.println("확인이요");
			break;
		case 2 :
			System.out.println("틀림");
			break;
		}
		
	}
	
	

}
