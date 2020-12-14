package step04.basic;

import org.omg.Messaging.SyncScopeHelper;

public class Step03Static {
	void m1() {	//��ü ���� �Ŀ��� ȣ�� ����
		System.out.println("non-static �޼ҵ�");
	}
	static void m2() {	// ��ü �������� Step03Static ������ ȣ�� ����
		System.out.println("static �޼ҵ�");
	}
	
	public static void main(String[] args) {
		Step03Static.m2();
		//Step03Static.m1(); ����
		/* �⺻ Ÿ���� Ŭ���� ������, ���� ��ü Ÿ�Ե�θ� ���� �� Ȱ���ؾ� �ϴ� ��Ȳ�� ���� ���� ...
		 * API���� 8���� �⺻ Ÿ���� support ���ִ� ���� Ŭ������
		 *  �⺻��(�⺻Ÿ��)�� ���� ���� = wrapper class��
		 *  int - Integer
		 *  byte - Byte
		 *  float - Float
		 * 	...
		 */
		//? java.lang.Integer�� �޼ҵ� �� ���ڿ�(String) -> int�� ��ȯ���ִ� �޼ҵ�
		/* �ʿ� ������ - String
		 * int ?(�ʿ䵥����String s)
		 */
		String s = "3";
		int i = Integer.parseInt(s);//String -> int
		System.out.println(i); //3 �̶�� int�� ����غ���
	}
	
}
