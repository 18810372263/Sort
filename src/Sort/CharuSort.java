package Sort;

//插入排序
public class CharuSort extends BaseSort implements SortMethod {

	public CharuSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		int temp = 0;

		for (int i = 1; i < len; i++) {
			temp = arrays[i];
			int j = i - 1;
			while (j >= 0 && arrays[j] > temp) {
				arrays[j + 1] = arrays[j];
				j--;
			}
			arrays[j + 1] = temp;
			times++;
		}
	}

	public void output() {
		System.out.println("插入排序次数: " + times);
		System.out.println("插入排序结果: " + IntstoString());
	}

}