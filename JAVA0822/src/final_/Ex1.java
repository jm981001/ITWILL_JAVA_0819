package final_;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * final 키워드
		 * - 클래스, 메서드, 변수에 지정 가능
		 * - 정말 마지막 이라는 뜻
		 * 
		 * 1) 멤버변수에 final 이 붙은 경우
		 * 		- 마지막 변수 => 변수값 변경 불가 => 상수로 취급됨
		 *        => 즉, 기존에 저장된 값을 사용하는 것만 가능하고, 값을 변경할 수는 없다!
		 *      - 기본문법 : final 데이터타입 변수명
		 *      ex) 원주율 계산을 위한 파이(PI) 값은 변경되면 안되므로 변수에 final 표기  
		 * 
		 * 2) 메서드에 final 이 붙은 경우
		 * 		- 마지막 메서드 => 메서드 변경 불가 => 오버라이딩 X
		 * 		  => 즉, 슈퍼클래스의 메서드를 상속받아 사용하는 것은 가능하나
		 * 			 오버라이딩을 통해 슈퍼클래스의 메서드를 변경(수정) 할수는 없다!
		 * 		- 기본문법 : [접근제한자] final 리턴타입 메서드명 (매개변수...) {}
		 * 
		 * 3) 클래스에 final 이 붙은 경우 
		 * 		- 마지막 클래스 => 클래스 변경 불가 => 상속 X
		 * 		  => 다른 클래스에서 해당 클래스를 상속 받을 수는 없다!
		 * 		  => 어떤 클래스 자체로 이미 완전한 클래스 기능을 수행하는 경우 상속을 금지시킴
		 * 		ex) String 클래스, Math 클래스 등
		 * 		- final 메서드보다 더 광범위한 제한을 두도록 할때 사용
		 * 		- 기본 문법 : [접근제한자] final class 클래스명 {}
		 * 
		 * */
		FinalMemberVariable fmv = new FinalMemberVariable();
		System.out.println(fmv.normalVar);
		fmv.normalVar = 99;
//		fmv.finalVar = 999; // 오류 발생! final로 선언된 멤버변수는 값 변경 불가!
		System.out.println(fmv.normalVar);
		System.out.println(fmv.finalVar);
		
		System.out.println("------------------------");
		// 로컬 변수는 선언만 가능
		// => 최초 데이터가 초기화 된 후 변경 불가
		final int a;
		a = 10;
//		a = 20;
		
		
	}

}

// final 멤버변수
class FinalMemberVariable {
	int normalVar;
	final int finalVar = 20;
}

// final 메서드
class FinalMethod {
	public void normalMethod() {
		System.out.println("normalMethod()");
	}
	
	public final void finalMethod() {
		System.out.println("finalMethod()");
	}
}

class SubClassFinalMethod extends FinalMethod {
	@Override
	public void normalMethod() {
		System.out.println("서브 클래스에서 오버라이딩 된 normalMethod()");
		
		// 상속 받았기 때문에 사용은 가능!!!
		finalMethod();
	}
	
//	@Override
//	public void finalMethod() {
		// 오류 발생! final 메서드는 서브클래스에서 오버라이딩 불가!
//		System.out.println("서브 클래스에서 오버라이딩 된 finalMethod()");
//	}
	
}


class A {}

// final 클래스 (자기자신은 상속을 받을 수 있음)
final class FinalClass extends A {}

//class SubClassFinalClass extends FinalClass {
//	// 오류 발생! final 클래스 상속 불가!
//}

class OtherClass {
	// final 클래스는 상속 (is - a 관계)은 불가능 하나
	// 포함(has - a)은 가능하다.
	FinalClass fc = new FinalClass();
}

// final 클래스의 대표적인 예 : String 클래스
//class OtherClass2 extends String {}










