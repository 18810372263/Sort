package Sort;

public class Test {
	
	public static void main(String[] args) {
		//����
		int[] ints = {6,5,3,1,8,7,2,4}; 
//		int[] ints = {7,5,6}; 
		//ð������
//		MaopaoSort maopao =new MaopaoSort(ints);
//		maopao.sort();
//		maopao.output();
		//��β������
//		CocktailSort cocktail =new CocktailSort(ints);
//		cocktail.sort();
//		cocktail.output();
		//ѡ������
//		XuanzeSort xuanze =new XuanzeSort(ints);
//		xuanze.sort();
//		xuanze.output();
		//ѡ������2
//		Xuanze2Sort xuanze2 =new Xuanze2Sort(ints);
//		xuanze2.sort();
//		xuanze2.output();
		//��������
//		CharuSort charu =new CharuSort(ints);
//		charu.sort();
//		charu.output();
		//���ֲ�������
//		CharuSort_2fen charu_2fen =new CharuSort_2fen(ints);
//		charu_2fen.sort();
//		charu_2fen.output();
//		//ϣ������
//		ShellSort shell =new ShellSort(ints);
//		shell.sort();
//		shell.output();
		//�鲢����
//		MergeSort merge = new MergeSort(ints);
//		merge.sort();
//		merge.output();
		//������
//		HeapSort heap = new HeapSort(ints);
//		heap.sort();
//		heap.output();
		//��������
		QuickSort quick = new QuickSort(ints);
		quick.sort();
		quick.output();
	}

}
