package try_catch;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 예외 발생
		 * - 미리 지정된 예외 상황이 아닌 개발자가 지정한 상황에서 직접 예외를 발생시키는 것
		 * - throw 키워드를 사용하여 특정 지점에서 예외를 발생 시킬 수 있다.
		 *   => throw 키워드가 사용된 위치의 코드는 예외 발생으로 인한 컴파일에러가 발생하며
		 *      예외 처리를 위해 try ~ catch 문을 사용하거나 throws 키워드로 위임해야함
		 * - 주로, 문법 오류는 아니나 개발자에 의해 논리적으로 오류로 취급해야하는 코드에서
		 *   해당 코드를 호출하는 곳으로 예외 발생 사실을 알려주기 위해(위임) 사용
		 *   
		 * < 기본 문법 >
		 * 예외가 발생해야하는 위치에서 다음 코드를 기술
		 * throw new 예외클래스명("예외메세지");
		 * => 예외클래스명에 해당하는 예외 객체가 생성되며 예외가 발생함(던져짐)
		 *    해당 객체의 메세지를 e.getMessage() 로 리턴받아 확인하거나
		 *    e.printStackTrace() 메서드를 호출하여 확인할 수 있다!
		 * 
		 * */
		
		int score = 1000;
		try {
			grade(score);
		} catch(Exception e) {
			// 정상범위가 아닌 점수가 입력되면 Exception 타입 예외가 발생하고
			// 해당 예외가 발생했을 때 수행할 작업을 catch 블록에서 기술
			System.out.println("점수 입력 오류! " + score);
		}
		
//		grade(score);
		System.out.println("정상 종료됨");
		
	} // main() 메서드 끝
	
	public static void grade(int score) throws Exception {
		// 실제 점수의 범위가 0 ~ 100 사이이므로 그외의 점수는 정상적인 입력이 아님
		// 따라서, 별도의 if문 등의 조건식을 통해 정상범위와 비정상범위 판별해야한다!
		// (int형 파라미터의 범위가 -21억 ~ +21억 이므로 0~100 사이가 아니어도 문법오류 X)
		
		if(score < 0 || score > 100) {
//			System.out.println("점수 입력 오류!");
			// 개발자에 의해 직접 예외를 발생 시키려면
			// 예외 발생 코드를 조건문을 통해 판별 후 해당 조건문 내에서
			// throw 키워드를 사용하여 예외클래스 타입 객체를 생성(new) 하여 던져야함(throw)
			// => 예외 클래스 객체의 파라미터에 예외 메세지를 전달 가능
//			throw new ArithmeticException("점수 입력 오류!");
			
			throw new Exception("점수 입력 오류!");
			
			// 예외를 직접 처리하는 경우 (별로 사용하지 않음)
//			try {
//				throw new ArithmeticException("점수 입력 오류!");
//			} catch(ArithmeticException e) {
//				e.printStackTrace();
//			}
		}
		
	}
	
	
	
	
	
	
	

}
