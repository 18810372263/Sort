package Sort;

//¼¦Î²¾ÆÅÅĞò (Ã°ÅİÅÅĞòµÄ±äÖÖ)
public class CocktailSort extends BaseSort implements SortMethod{
	
	public CocktailSort(int[] arrays) {
		this.arrays = arrays;
		len=arrays.length;
	    times = 0;
	}
	
	//Ä¬ÈÏÎªsort_max
	public void sort() {
		int left=0,right=len-1;
		while(left < right) {
			for(int i=left;i<right;i++) {
				if(arrays[i] > arrays[i+1]) {
					swap(i,i+1);
				}
			}
			right--;
			times++;
			for(int i=right;i>left;i--) {
				if(arrays[i-1] > arrays[i]) {
					swap(i-1,i);
				}
			}
			left++;
			times++;
		}
	}
	
	public void output() {
		System.out.println("¼¦Î²¾ÆÅÅĞò´ÎÊı: "+times);
		System.out.println("¼¦Î²¾ÆÅÅĞò½á¹û: "+IntstoString());
	}
			
}