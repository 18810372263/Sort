package Sort;

//ð������
public class MaopaoSort extends BaseSort implements SortMethod{
	
	public MaopaoSort(int[] arrays) {
		this.arrays = arrays;
		len=arrays.length;
		times = 0;
	}
	
	//Ĭ��Ϊsort_max
	public void sort() {
		sort_max();
//		sort_min();
	}
	
	public void output() {
		System.out.println("ð���������: "+times);
		System.out.println("ð��������: "+IntstoString());
	}
			
	//�ҳ����ֵ�������
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
	
	//�ҳ���Сֵ����ǰ��
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
