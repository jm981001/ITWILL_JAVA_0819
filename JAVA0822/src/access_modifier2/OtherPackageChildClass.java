package access_modifier2;

import access_modifier.ParentClass;

public class OtherPackageChildClass extends ParentClass {
	// 패키지가 다르고 상속 관계에 있는 서브클래스에서 접근 범위
	public void useMember() {
		// 주의! 상속 관계에서 슈퍼클래스의 멤버에 접근할 때
		// 슈퍼클래스의 인스턴스를 생성하여 접근할 경우 상속 관계로써의 접근이 아니게 된다!
		ParentClass p = new ParentClass();
		p.publicVar = 10;		// (O) - 누구나 접근 가능
//		p.protectedVar = 20;	// (X) - 다른 패키지이고 상속 관계가 아니므로 접근 불가
//		p.defaultVar = 30;		// (X) - 다른 패키지이므로 접근 불가
//		p.privateVar = 40;		// (X) - 다른 클래스에서 접근 불가
		
		this.publicVar = 10;	// (O) - 누구나 접근 가능
		this.protectedVar = 20;	// (O) - 다른 패키지이지만 상속 관계이므로 접근 가능
//		this.defaultVar = 30;	// (X) - 다른 패키지이므로 접근 불가
//		this.privateVar = 40;	// (X) - 다른 클래스에서 접근 불가
	}
}
