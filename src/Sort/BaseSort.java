package Sort;
//�������  + ���ݽ��� + ���
public class BaseSort {

	protected int[] arrays;
	protected int len;
	protected int times;//�������
	
//	public BaseSort(int[] ints) {
//		this.ints = ints;
//		len=ints.length;
//		times=0;
//	}
	
	// ����ints[i]��ints[j]
	protected void swap(int i, int j) {
		int temp = arrays[i];
		arrays[i] = arrays[j];
		arrays[j] = temp;
	}

	protected String IntstoString() {
		String result = "";
		for (int i = 0; i < len; i++)
			result += arrays[i] + " ";
		return result;
	}

	// ���������Ϣ
//	protected void output() {
//		System.out.println(IntstoString());
//	}
}
