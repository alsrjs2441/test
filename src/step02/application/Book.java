/*	���� ������ ǥ���� �� �ִ� Ŭ���� - ������ ǥ���� ���� ���� Ŭ����
 * 	Data Transfer Object[DTO] pattern
 * 	Value Object pattern[VO]
 * 
 */
package step02.application;

public class Book {
	//��� ������
	String isbn;
	String bookName;
	//�ܺο��� ȣ�� �Ұ� �� ���� ����, ������ Book Ŭ���������� ȣ�� ������ ����
	private int birthDay;	//2020�� ������ �����Ϳ� ���ؼ� ��ȿ
	
	// �⺻ ������
	Book(){} 
	// ��ü ���� �� ��� ������ ���� ���ϴ� �����ͷ� �ʱ�ȭ
	Book(String i, String b, int d){
		isbn = i;
		bookName = b;
		setBirthDay(d);
	}
	public String getIsbn() {
		return isbn;
	}
	//��� ������� ���� ���� ���� ������ ��� ��� ������ this. �ʼ�
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBirthDay() {
		return birthDay;
	}
	/* ����
	 * birthDay ��� ������ �ݵ�� 20�� ���� �����͸� ����
	 * �� ������ �����ʹ� ���� �Ұ����� ��
	 * 
	 * ����(if)�� �Է��Ϸ��� ������ ���� 20���� ���ų� ũ�� (>=) ����(=)
	 * �ƴ϶�� ���� �Ұ�
	 */
	public void setBirthDay(int birthDay) {
		if(birthDay >= 2020) {
			//���� ���� true�� ��� ����Ǵ� ���
			this.birthDay = birthDay;
		}else {
			System.out.println("��ȿ�� ���ǳ⵵");
		}		
	}
	
	//������ ����� ���Ǽ��� ���ؼ� ��� ��� ������ ���� �� ���� ��ȯ�ϴ� �޼ҵ� �߰� ����
	//�ڹ��� ��ȯ Ÿ���� �ݵ�� �ϳ��� ����
	//���ڿ��� ����, +(���Կ�����)
	public String toString() {
		return isbn + " " + bookName + " " + birthDay;
	}
}
