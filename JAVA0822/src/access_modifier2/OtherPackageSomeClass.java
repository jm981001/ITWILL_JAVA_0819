package access_modifier2;

import access_modifier.ParentClass;

public class OtherPackageSomeClass {

	// 패키지가 다르고 상속 관계가 아닌 클래스에서 접근 범위
	public void useMember() {
		ParentClass p = new ParentClass();
		p.publicVar = 10;	// (O) - 누구나 접근 가능
//		p.protectedVar = 20;// (X) - 다른 패키지이고 상속 관계가 아니므로 접근 불가
//		p.defaultVar = 30;	// (X) - 다른 패캐지이므로 접근 불가
//		p.privateVar = 40;	// (X) - 다른 클래스에서 접근 불가
	}
}
