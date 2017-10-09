package Sort;

//Ï£¶ûÅÅĞò
public class ShellSort extends BaseSort implements SortMethod{
	
	public ShellSort(int[] arrays) {
		this.arrays = arrays;
		len = arrays.length;
		times = 0;
	}

	//
	public void sort() {
		int h = 0;
		
		while(h<=len) {
			h=3*h+1;
		}
		while(h>=1) {
			for(int i=h;i<len;i++) {
				int j=i-h;
				int temp = arrays[i];
				while(j>=0 && arrays[j]>temp) {
					arrays[j+h]=arrays[j];
					j=j-h;
				}
				arrays[j+h]=temp;
			}
			h=(h-1)/3;
			times++;
		}
	}

	public void output() {
		System.out.println("Ï£¶ûÅÅĞò´ÎÊı: " + times);
		System.out.println("Ï£¶ûÅÅĞò½á¹û: " + IntstoString());
	}

}
