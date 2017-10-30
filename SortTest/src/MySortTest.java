import java.util.Random;

public class MySortTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Integer[] a={1,2,123,1234,5,6,7,23,45,6,45,6,2,3,5,4,3,2,1,9,8,7,5,6,7,8,4,3,2,1};
		MySort.show(a);
		//MySelectionSort.sort(a);
		//MyInsertionSort.sort(a);
		//MyShellSort.sort(a);
		//MyMergeSort.sort(a);
		//MyMergeSort2.sort(a);
		//MyFinalMerge.sort(a);
		//MyFinalMerge2.sort(a);
		//MyQuickSort.shuffle(a);
		//MyQuickSort.sort(a);
		//MyThreeWayQuickSort.sort(a);
		MyHeapSort.sort(a);
		MySort.show(a);	
		System.out.println(MySort.isSorted(a));
		
/*		for (int i=0;i<100;i++){
		Random j=new Random();
		System.out.println(j.nextInt(10));
		System.out.println((int)(Math.random()*10)+"----");
		}
*/	
		//int n=5;System.out.println((++n>5));
		}
}
