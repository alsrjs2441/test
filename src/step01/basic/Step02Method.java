/* �н�����
 * 1. ���� �Ϻ� ������ Ȱ���ؼ� �޼ҵ� ���� ����
 * 2. ��Ģ���� ���
 * 		��� - 4��(�޼ҵ� 4��)
 * 			�޼ҵ庰 �ּ� �ʿ��� ���� = �Էµ����� 2��, ��°� 1��
 * 
 * 		����� �ʿ��� �ּ� ������ - 2��
 * 		: 2���� �Է� ������ + ��Ģ����� = ���
 * 		
 */
package step01.basic;

public class Step02Method {

	//+ ����� �޼ҵ� ���� : sum, ����� ������� ȣ���� ������ �ֱ�
	int sum(int v1, int v2) {
		int r = v1 + v2;
		return r;
	}
	
	void min(int v1, int v2) {
		System.out.println(v1 - v2);
	}
	
	
	public static void main(String[] args) {
		Step02Method s = new Step02Method();
		//���ϱ� ����� �޼ҵ� ȣ��
		int result = s.sum(3, 4);
		System.out.println(result);
		s.min(10, 2);
	}

}
