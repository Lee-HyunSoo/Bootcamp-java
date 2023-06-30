package com.lhs;

/*
 * thread : 백그라운드에서 수행되는 프로세스의 일종
 * Java는 기본적으로 thread를 제공해준다. 이것이 main() 메서드이고, 주 스레드라고 부른다.
 * 
 * thread 사용방법
 * 1. thread 상속
 * 2. runnable 인터페이스 구현 : public void run(); 이라는 추상메서드가 정의되어있다. -> thread 진입점
 * 
 * public class Test extends Thread implements Runnable() : 일반클래스는 상속도받고 구현도 가능하긴 하다. 실제로는 잘안쓴다.
 * 1. Thread.class : java.base.jar -> java.lang.Thread.class 로 존재
 *  public class Thread implements Runnable() {
 *  	// 변수 / 생성자
 *  	@Override
 *  	public void run() { }
 *  	// 메서드들
 *  }
 * 2. thread를 상속받을 경우, 반드시 run() 내부에 실행내용을 override 해야한다.
 * 3. thread 클래스를 상속받는 클래스의 객체를 생성
 * 4. 생성한 객체를 통해 start()를 호출 했을 경우에만 thread가 구동된다.
 * 5. thread는 main thread가 종료되면 자동으로 멈춘다.
 * 
 * Java의 thread : sw적 병렬처리 방식 / hw적 병렬처리 : 다중 서버를 사용 / 하나의 서버에서 병렬 처리를 하는 것 : gpu
 * 
 * thread 내부에는 private String name; 이라는 변수가 존재한다.
 * 이 변수는 private으로 선언되어있어서 상속을 받아도 변수에 접근하기 위해선 getter, setter가 필요하다.
 * 
 * thread에 이름 부여
 * 1. 파생(자식) 클래스의 생성자 내부에 부모(thread) 클래스의 생성자에 이름을 전달하여 초기화 (super)
 * 2. 부모(thread) 클래스의 setName()을 이용하는 방법
 * thread 이름 추출 : getName()
 * 
 * 주 스레드(main 메서드) 를 다른 thread 작업이 종료 할 때까지 대기시키는 방법 : join()
 * 단, 주 스레드의 진행 상태를 강제적으로 대기시키기 때문에 예외처리가 필요하다. (Interrupt Exception)
 * 
 * thread 일정 시간동안 멈추기 : Thread.sleep(1/1000초)
 * sleep() 의 시간은 1000 -> 1초
 * sleep()은 스레드 진행을 강제적으로 멈추기 때문에 예외처리가 필수이다.
 * 
 * File f = new File(null); // local파일에 대한 마지막수정날짜, 크기 등을 알아낼 수 있는 class
 */

public class ThreadTest {

	public static void main(String[] args) { // 주 스레드
		System.out.println("main() 시작");
		
//		ThreadName threadName1 = new ThreadName("t1");
//		ThreadName threadName2 = new ThreadName("t2");
//		ThreadName threadName3 = new ThreadName("t3");
//		
//		// thread는 각각 움직인다. 떄문에 순차실행이 아니라 출력순서가 뒤죽박죽이다.
//		threadName1.start();
//		threadName2.start();
//		threadName3.start();
//		
//		// 주 스레드(main)을 다른 thread 작업이 종료 될 때까지 정지
//		try {
//			threadName1.join();
//			threadName2.join();
//			threadName3.join();
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
		
//		// 보통 사용하는 순차진행 방법. join을 한 thread의 진행과 같다.
//		FakeThread threadName4 = new FakeThread();
//		FakeThread threadName5 = new FakeThread();
//		FakeThread threadName6 = new FakeThread();
//		threadName4.start();
//		threadName5.start();
//		threadName6.start();
		
		RunnableClass runnableClass1 = new RunnableClass();
		RunnableClass runnableClass2 = new RunnableClass();
		RunnableClass runnableClass3 = new RunnableClass();
		
		
//		// 마치 thread처럼 보인다. 때문에 start() 는 마음대로 만들면안된다. thread에 대한 개념이 사라지기 떄문이다.
//		runnableClass1.start();
//		runnableClass2.start();
//		runnableClass3.start();
		
//		// thread 와 runnable interface의 관계를 지키기 위해 이렇게 사용한다.
//		Thread thread1 = new Thread(runnableClass1);
//		Thread thread2 = new Thread(runnableClass2);
//		Thread thread3 = new Thread(runnableClass3);
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
//		// 익명객체 : 객체 생성 없이, 바로 메서드에 접근해 사용도 가능하다. 하지만 join() 을 사용하기 위해서는 객체생성이 필요하다.
//		new Thread(runnableClass1).start();
//		new Thread(runnableClass2).start();
//		new Thread(runnableClass3).start();
		
//		// thread 일정 시간동안 멈추기
//		SleepThread s = new SleepThread();
//		s.start();
		
		// implements Runnable을 이용한 Thread.sleep()
		RunnableTest runnableTest = new RunnableTest();
		new Thread(runnableTest).start();
		
		System.out.println("main() 종료");
	}

}
