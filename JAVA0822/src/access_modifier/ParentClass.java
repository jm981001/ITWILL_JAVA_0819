package access_modifier;

// 접근제한자에 따른 접근 범위 차이 확인을 위한 슈퍼클래스 정의
public class ParentClass {
	public int publicVar;		// 모든 클래스
	protected int protectedVar;	// 같은 패키지 또는 다른 패키지이면서 상속관계에 있는
								// 서브클래스만 접근 가능
	int defaultVar;				// 같은 패키지
	private int privateVar;		// 자신의 클래스 내에서만 접근 가능
	
	public void useMember() {
		this.publicVar = 10; 	// (O)
		this.protectedVar = 20;	// (O)
		this.defaultVar = 30;	// (O)
		this.privateVar = 40;	// (O)
	}
}
