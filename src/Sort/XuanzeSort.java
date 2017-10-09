package Sort;

//选择排序
public class XuanzeSort extends BaseSort implements SortMethod {

	public XuanzeSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	// 默认为sort_max
	public void sort() {
		sort_max();
//		sort_min();
	}

	public void output() {
		System.out.println("选择排序次数: " + times);
		System.out.println("选择排序结果: " + IntstoString());
	}

	// 找出最大值放在最后
	public void sort_max() {
		int left = 0, right = len, max, temp;

		while (true) {
			max = Integer.MIN_VALUE;
			temp = -1;
			for (int i = left; i < right; ++i) {
				if (arrays[i] >= max) {
					max = arrays[i];
					temp = i;
				}
			}
			if (temp != -1) {
				swap(temp, right - 1);
			} else {
				return;
			}
			right--;
			times++;
		}
	}

	// 找出最小值放在前面
	public void sort_min() {
		int left = 0, right = len, min, temp;

		while (true) {
			min = Integer.MAX_VALUE;
			temp = -1;
			for (int i = left; i < right; ++i) {
				if (arrays[i] < min) {
					min = arrays[i];
					temp = i;
				}
			}
			if (temp != -1) {
				swap(temp, left);
			} else {
				return;
			}
			left++;
			times++;
		}
	}
}