package step01.basic;

public class Step03CustomerTest {

	public static void main(String[] args) {
		// ���� ��� �����ϰ� �޸𸮿� ���� : ��ü ����
		Customer c1 = new Customer(); // name, age, grade
		
		/*	Customer c2 = new Customer();
		 * 	Customer - Customer��� Ŭ������ �����ϱ� ������ Ÿ������ ����
		 * 	c2 - �ش� ������(��ü)�� �����ϴ� ����
		 *  = ���Կ�����
		 *  new - �ڹ� ���忡�� ��ü ������ �󤷵Ǵ� �߿��� Ű����
		 *  Customer() - �� ���°� �����ϱ� ������ ȣ��
		 *			   - ������
		 *			   - Ŭ���� ���� �ÿ� �����ڰ� �ڵ����� �ʾƵ� �ڵ����� ����  		 
		 */
		Customer c2 = new Customer();
		
		// ���� ���� ����
		//c1.age = 10;
		// ����� ���� �� Ȯ��
		//int age = c1.age;
		//System.out.println(age);
		// ���� �� ����
		c1.setAge(11); // int age3 = c1.setAge(11); �� �Ұ�, ��ȯ ���� ���� ������
		// ����� ���� �� Ȯ��
		System.out.println(c1.getAge()); // c1.age
	}

}
