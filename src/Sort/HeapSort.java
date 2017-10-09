package Sort;

//堆排序
public class HeapSort extends BaseSort implements SortMethod {

	public HeapSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		// sortHeap_min();
		sortHeap_max();
	}

	// 建立最小堆
	public void sortHeap_min() {
		for (int i = len; i > 0; --i) {
			for (int j = (i / 2) - 1; j >= 0; --j) {
				judge_swap_min(i, j);
			}
			swap(0, i - 1);
		}
	}

	// 判断父节点,左孩子,右孩子如何交换
	public void judge_swap_min(int mlen, int k) {
		if (2 * k + 1 > mlen - 1) {
			return;
		} else {
			int tempmark = 0, temp = 0;
			if (2 * k + 2 > mlen - 1) {
				temp = arrays[2 * k + 1];
				tempmark = 2 * k + 1;
			} else {
				if (arrays[2 * k + 2] > arrays[2 * k + 1]) {
					temp = arrays[2 * k + 1];
					tempmark = 2 * k + 1;
				} else {
					temp = arrays[2 * k + 2];
					tempmark = 2 * k + 2;
				}
			}
			if (arrays[k] > temp) {
				swap(tempmark, k);
			}
		}
	}

	// 建立最小堆
	public void sortHeap_max() {
		for (int i = len; i > 0; --i) {
			for (int j = (i / 2) - 1; j >= 0; --j) {
				judge_swap_max(i, j);
			}
			swap(0, i - 1);
		}
	}

	// 判断父节点,左孩子,右孩子如何交换
	public void judge_swap_max(int mlen, int k) {
		if (2 * k + 1 > mlen - 1) {
			return;
		} else {
			int tempmark = 0, temp = 0;
			if (2 * k + 2 > mlen - 1) {
				temp = arrays[2 * k + 1];
				tempmark = 2 * k + 1;
			} else {
				if (arrays[2 * k + 2] > arrays[2 * k + 1]) {
					temp = arrays[2 * k + 2];
					tempmark = 2 * k + 2;
				} else {
					temp = arrays[2 * k + 1];
					tempmark = 2 * k + 1;
				}
			}
			if (arrays[k] < temp) {
				swap(tempmark, k);
			}
		}
	}

	public void swap(int m, int n) {
		int temp = arrays[m];
		arrays[m] = arrays[n];
		arrays[n] = temp;
	}

	public void output() {
		// System.out.println("堆排序次数: " + times);
		System.out.println("堆排序结果: " + IntstoString());
	}

}
