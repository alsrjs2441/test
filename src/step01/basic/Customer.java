/*	�н�����
 * 	1. �޼ҵ� ����, ȣ�� ���� ������
 * 	2. ���� Ŭ������ ���� �޼ҵ� ȣ�� ���� �ͼ�������
 */
package step01.basic;

public class Customer {
	//��� ����
	private String name; // ��ü �����ÿ� ��ü�� ���� �޸� ���ο� ���� �� ���� 
	private int age;
	private String grade; // vvip , vip , silver
	
	//�������� ������ �ʾ����� �ڵ� ������ �ڵ�
	public Customer(){}
	public Customer(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setNume(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}
