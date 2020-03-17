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
	//������ ���� �׽�Ʈ�� �ϱ� ���ؼ��� ���̺귯��(JUint)�� �߰��Ѵ�. 
	//JUint �̶�?
	//������ ���� �׽�Ʈ�� �������ִ� �����ӿ�ũ
	/**
	 * @Test     // @Test �� ����� �޼��尡 �׽�Ʈ�� �����Ѵ�.
	 * @Ignore   // �׽�Ʈ�� �������� �ʴ´�.
	 * @Before   // @Test �� ����� �޼��尡 ����Ǳ� ���� ����
	 */
	
	/**
	 * sysout���δ� �ݼֿ� ����� ���������
	 * ����(assert)�޼���� �׽�ũ�� ����� �Ǻ��Ѵ�.
	 * ������� asserEquals(����, ������)
	 * ���� ���� �޼���� ���󰪰� �������� ��ġ�ϸ� ����,
	 * ��ġ���� ������ ����
	 */
	/**
	 * JUnit �޼���
	 * assertEquals(a,b) - ��ü �Ǵ� ���� ��ġ �ϴ°�?
	 * assertArrayEquals(a,b) - �迭�� ���� ��ġ�ϴ°�?
	 * assertSame(a,b) - ���� ��ü �ΰ�?
	 * assertTrue(a) - ������ ���ΰ�?
	 * assertNotNull(a) - ��ü�� null �� �ƴѰ�?
	 * assertNull(a) - ��ü�� null�ΰ�?
	 */
}
