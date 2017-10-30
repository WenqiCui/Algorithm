
public class MyInsertionSort extends MySort {
	public static void sort(Comparable[] a){
		int n=a.length;
		for (int i=1;i<n;i++){
			for (int j=i-1;j>=0;j--){
				if (less(a[j+1],a[j])) exch(a,j,j+1);
				else break;
			}
		}
	}

}
