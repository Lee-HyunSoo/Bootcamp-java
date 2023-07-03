package com.lhs.dip;

/*
 * public class Test {
 * 	public Test() {
 * 	}
 * 	public Test(Test2 test2) {
 * 	}
 * }
 * 
 * public class Test2 {
 * 	public Test2() {
 * 	}
 * 	public Test2(Test test) {
 * 	}
 * }
 * 
 * Test t = new Test(new Test2(new Test()));
 * Test2 t = new Test2(new Test(new Test2()));
 * 
 * 위 예시는 클래스로서 의미가 없다. Test를 만들려면 Test2를 인자로 받아야하고, 이 Test2는 또 Test를 인자로 받고있기 때문이다.
 * 이처럼 클래스 간 결합도가 너무 높으면 좋은 코드가 될 수 없다.
 *  
 * 의존성 : 결합도가 낮고, 응집도가 높아야한다. -> 두 객체가 각각 생성될 수 있어야한다. 즉, 독립적이어야한다.
 * 
 * 평균 / 합 / count
 * public void avg() {
 * 	sum();
 * 	count();
 * }
 * 
 * public void sum() {
 * }
 * 
 * public void count() {
 * }
 * 
 * 이렇게 avg() 내에 sum()과 count()를 넣으면 avg()는 sum()과 count()에 의존성을 갖게 되버려, 결합도가 강해져버린다.
 * 이를 해결하기 위해 보통 return 값을 설정해, avg만 계산 후 return 시킨다. (자신의 로직만 해결 -> 응집도 상승)
 * 
 * public double avg(int sum, int count) {
 * 	return avg;
 * }
 * 
 * 
 */
public class Client {

	public Client() {
	}

}
