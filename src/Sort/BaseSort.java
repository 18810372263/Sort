package Sort;
//存放数据  + 数据交换 + 输出
public class BaseSort {

	protected int[] arrays;
	protected int len;
	protected int times;//排序次数
	
//	public BaseSort(int[] ints) {
//		this.ints = ints;
//		len=ints.length;
//		times=0;
//	}
	
	// 交换ints[i]和ints[j]
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

	// 输出数组信息
//	protected void output() {
//		System.out.println(IntstoString());
//	}
}
