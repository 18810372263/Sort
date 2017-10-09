package Sort;

//二分 插入排序
public class CharuSort_2fen extends BaseSort implements SortMethod {

	public CharuSort_2fen(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		int temp = 0;

		for (int i = 1; i < len; i++) {
			int left =0,right =i-1;
			temp = arrays[i];
			
			while(left <= right) {
				int mid = (left + right)/2;
				if(arrays[mid] > temp) {
					right = mid-1;
				}else {
					left = mid+1;	
				}
			}
			
			for(int j=i-1;j>=left;--j) {
				arrays[j+1]=arrays[j];
			}
			arrays[left] = temp;
			times++;
		}
	}

	public void output() {
		System.out.println("二分插入排序次数: " + times);
		System.out.println("二分插入排序结果: " + IntstoString());
	}

}