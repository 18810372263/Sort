package Sort;

//两端同时查找 的选择排序
public class Xuanze2Sort extends BaseSort implements SortMethod {

	public Xuanze2Sort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		int left = 0, right = len, min, max, tempmin, tempmax;

		while (true) {
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			tempmin = -1;
			tempmax = -1;
			for (int i = left; i < right; ++i) {
				if (arrays[i] <= min) {
					min = arrays[i];
					tempmin = i;
				}
				if (arrays[i] >= max) {
					max = arrays[i];
					tempmax = i;
				}
			}
			//
			if (max == min) {
				return;
			}
			//
			if(tempmin != -1) {
				swap(tempmin, left);
				left++;
			}
			else {
				return;
			}
			//
			if(tempmax != -1) {
				swap(tempmax, right - 1);
				right--;
			}  else {
				return;
			}			
			times++;
		}
	}

	public void output() {
		System.out.println("选择排序2次数: " + times);
		System.out.println("选择排序2结果: " + IntstoString());
	}

}