package step02.application;

public class BookCRUD {
	Book book; //��� �޼ҵ忡�� �����ϴ� �ڿ�
	//����
	/*	ȣ����(�����) ����
	 * 	- ���� �޼ҵ� ȣ��ø��� ���ο� �����ͷ� å ����
	 * 		: save(String isbn, String name, int birthDay)
	 * 	- �޼ҵ� body�� �̹� ������ �����ͷ� Book�� ���� �� ����
	 * 		: save(){..}
	 */
	void save(String isbn, String name, int birthDay) {
		book = new Book(isbn, name, birthDay);
	}
	
	//�˻�
	void search() {
		//book.toString()
		/*	book ������ �����ϴ� �ּ� ���� ��ü�� ������ toStirng() ȣ������ �ǹ�
		 * 	book�� �����ϴ� ��ü�� ���� ��� - ����
		 * 			"		 ���� ��� - ���µ� ȣ���ߴ� ū�ϳ���
		 */
		System.out.println(book.toString());
	}
	
	//���� 
	void update(String newName) {
		book.setBookName(newName);
	}
	//����
	void delete() {
		book = null; //�ּ� ���� �ʱ�ȭ�ϴ� Ű����, �� ���� Ÿ�� ������ �⺻��
	}
	public static void main(String[] args) {
		BookCRUD crud = new BookCRUD();
		//? CRUD ���� ������� ȣ���ϼż� ����� Ȯ�� �ϱ�
		//������ ����->Ȯ��(�˻�)->����->Ȯ��(�˻�)->����->Ȯ��(�˻�)
		crud.save("���", "Ȯ��", 20201104);
		crud.search();
		crud.update("change");
		crud.search();
		crud.delete();
		crud.search();

	}

}
