package Sort;

//快速排序
public class QuickSort extends BaseSort implements SortMethod {

	public QuickSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		quicksort(0, len - 1);
	}

	public void quicksort(int left, int right) {
		int temp = arrays[left], leftmark = left, rightmark = right;
		boolean change = false;

		while (leftmark < rightmark) {
			while (temp < arrays[rightmark]) {
				rightmark--;
			}
			if (leftmark < rightmark) {
				arrays[leftmark] = arrays[rightmark];
				leftmark++;
				change = true;
			}
			//
			while (temp > arrays[leftmark]) {
				leftmark++;
			}
			if (leftmark < rightmark) {
				arrays[rightmark] = arrays[leftmark];
				rightmark--;
				change = true;
			}
			if (leftmark > rightmark) {
				arrays[rightmark] = temp;
			} else {
				arrays[leftmark] = temp;
			}
//			System.out.println(" leftmark = " + leftmark + " rightmark = " + rightmark);
//			output();
		}
		if (change) {
			quicksort(left, leftmark - 1);
			quicksort(rightmark + 1, right);
		}
	}

	public void output() {
		// System.out.println("快速排序次数: " + times);
		System.out.println("快速排序结果: " + IntstoString());
	}

}
