
public class MyHeapSort extends MySort {
	public static void sort(Comparable[] a){
		BinaryHeap heap=new BinaryHeap();
		heap.add(a);
		for (int i=a.length-1;i>=0;i--){
			a[i]=heap.remove();
		}
	}

}
