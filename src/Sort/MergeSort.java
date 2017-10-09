package Sort;

//归并排序
public class MergeSort extends BaseSort implements SortMethod {

//	private int pace = 2;

	public MergeSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		// MergeSortRecursion(0, len-1);
		MergeSortIteration();
	}

	// 归并排序的递归实现
	public void MergeSortRecursion(int left, int right) {
		if (left == right)
			return;
		int mid = (left + right) / 2;
		MergeSortRecursion(left, mid);
		MergeSortRecursion(mid + 1, right);
		Merge(left, mid, right);
	}

	public void Merge(int left, int mid, int right) {
		int m = left, n = mid + 1, k = right - left + 1, temp = 0;
		int[] marrays = new int[k];

		while (m <= mid && n <= right) {
			if (arrays[m] > arrays[n]) {
				marrays[temp] = arrays[n];
				n++;
			} else {
				marrays[temp] = arrays[m];
				m++;
			}
			temp++;
		}
		while (m <= mid) {
			marrays[temp] = arrays[m];
			m++;
			temp++;
		}
		while (n <= right) {
			marrays[temp] = arrays[n];
			n++;
			temp++;
		}
		for (int i = 0; i < k; i++) {
			arrays[left + i] = marrays[i];
		}
	}

	// 归并排序的非递归实现
	public void MergeSortIteration() {
		int left,mid,right;
		for (int i = 1; i < len; i *= 2) {
			left = 0;
			while (left + i < len) {
				mid = left + i - 1;
				right = mid + i < len ? mid + i : len - 1;
				Merge(left, mid, right);
				left = right + 1;
			}
		}
	}

	public void output() {
		// System.out.println("归并排序次数: " + times);
		System.out.println("归并排序结果: " + IntstoString());
	}

}
