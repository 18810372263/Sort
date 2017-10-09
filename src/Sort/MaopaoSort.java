package Sort;

//冒泡排序
public class MaopaoSort extends BaseSort implements SortMethod{
	
	public MaopaoSort(int[] arrays) {
		this.arrays = arrays;
		len=arrays.length;
		times = 0;
	}
	
	//默认为sort_max
	public void sort() {
		sort_max();
//		sort_min();
	}
	
	public void output() {
		System.out.println("冒泡排序次数: "+times);
		System.out.println("冒泡排序结果: "+IntstoString());
	}
			
	//找出最大值放在最后
	public void sort_max() {
		boolean change = true;
		
		while(change) {
			change = false;
			for(int i=0;i<len-1-times;i++) {
				if(arrays[i] > arrays[i+1]) {
					swap(i,i+1);
					change=true;
				}
			}
			times++;
		}
	}
	
	//找出最小值放在前面
	public void sort_min() {
		boolean change = true;
		
		while(change) {
			change = false;
			for(int i=len-1;i>times;i--) {
				if(arrays[i-1] > arrays[i]) {
					swap(i-1,i);
					change=true;
				}
			}
			times++;
		}
	}	

}
