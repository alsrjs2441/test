package step01.basic;

public class Step05ReferenceArray {
	//Customer �迭 �����ؼ� ������ ����
	static Customer [] getCs(){
		Customer [] all = {new Customer("��ΰ�", 26, "v"),
						new Customer("�ǿ���", 26, "v")};
		return all;
	}
	//Customer �迭�� �����͸� �ݺ��� Ȱ���ؼ� ���
	/* all[i].getName()
	 * all - Customer[]
	 * all[0] or all[1] - Customer
	 * all[0].getName() - String �̸���
	 */
	static void printAll(Customer [] all) {
		for(int i=0 ;i < all.length;i++) {
			System.out.println(all[i].getName());
		}
	}
	public static void main(String[] args) {
		Customer [] c = getCs();
		printAll(c);
	}

}
