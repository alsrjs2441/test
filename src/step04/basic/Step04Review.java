/* ��ü ������ ���� �����ڴ� �����ڰ� ���ڵ��� �ڵ����� �߰�(�⺻ ������)
 * ������{} ���ο��� ��� ������ ����...
 */
package step04.basic;

class A {
	int no = 10;
	A(){
		System.out.println("A");
	}
	int getNo() {
		return no;
	}
}

class B {
	A a = new A();
	B(){
		System.out.println("B");
	}
}

class C {
	B b = new B();
	C(){
		System.out.println("C");
	}
}

public class Step04Review {

	public static void main(String[] args) {
		/*
		 * �̼� 1 - A Ŭ������ no ������ ��� 
		 * �̼� 2 - ��ü ���� ����? a-b-c
		 */
		C c = new C();
		System.out.println(c.b.a.no);
		System.out.println("A->B->C");
	}

}
