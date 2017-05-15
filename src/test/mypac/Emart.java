package test.mypac;
/*
 * this 라는 예약어는 해당 클래스로 객체가 생성되었을때
 * 생성된 객체의 참조값을 지칭하는 예약어이다.
 */

public class Emart {
	// 동일한 객체 안에서 같은 멤버에 있는 메소드를 호출 할 일도 있음
	// 일반 멤버 메소드는 참조값에 점찍어서 호출
	
	// 내가 객체가 되었을때 참조값이 몇인지는 알수가 없지만
	// 그 참조값을 가리키는 예약어가 있어 == this
	
	// 주문하는 메소드
	public void order(){
		System.out.println("order 메소드 호출됨");
		// order() 메소드가 호출되었을때 동일한 객체의 메소드 호출하기.
		this.make();
		this.deliver();
	}
	// 상품을 만드는 메소드
	public void make(){
		System.out.println("make 메소드 호출됨");
	}
	// 상품을 배달하는 메소드
	public void deliver(){
		System.out.println("deliver 메소드 호출됨");
	}
}
