package TestCode;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import mainSrc.Member;

public class TMember {
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember,oldMember);
//		assertNotNull(newMember);
//		assertSame(newMember,oldMember);
		if(newMember == null) {
			System.out.println("ok");
		}
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = new Member();
	}
	//독립된 단일 테스트를 하기 위해서는 라이브러리(JUint)을 추가한다. 
	//JUint 이란?
	//독립된 단위 테스트을 지원해주는 프레임워크
	/**
	 * @Test     // @Test 가 선언된 메서드가 테스트를 수행한다.
	 * @Ignore   // 테스트를 실행하지 않는다.
	 * @Before   // @Test 가 선언된 메서드가 실행되기 전에 실행
	 */
	
	/**
	 * sysout으로는 콜솔에 결과를 출력하지만
	 * 단점(assert)메서드로 테스크의 결과를 판별한다.
	 * 예를들어 asserEquals(예상값, 실제값)
	 * 위의 단정 메서드는 예상값과 실제값이 일치하면 성공,
	 * 일치하지 않으면 실패
	 */
	/**
	 * JUnit 메서드
	 * assertEquals(a,b) - 객체 또는 값이 일치 하는가?
	 * assertArrayEquals(a,b) - 배열의 값이 일치하는가?
	 * assertSame(a,b) - 같은 객체 인가?
	 * assertTrue(a) - 조건이 참인가?
	 * assertNotNull(a) - 객체가 null 이 아닌가?
	 * assertNull(a) - 객체가 null인가?
	 */
}
