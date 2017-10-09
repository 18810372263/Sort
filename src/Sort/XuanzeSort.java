package Sort;

//ѡ������
public class XuanzeSort extends BaseSort implements SortMethod {

	public XuanzeSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	// Ĭ��Ϊsort_max
	public void sort() {
		sort_max();
//		sort_min();
	}

	public void output() {
		System.out.println("ѡ���������: " + times);
		System.out.println("ѡ��������: " + IntstoString());
	}

	// �ҳ����ֵ�������
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

	// �ҳ���Сֵ����ǰ��
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