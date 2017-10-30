
public class MySelectionSort extends MySort {
	public static void sort(Comparable a[]){
		int n=a.length;
		for (int i=0;i<n-1;i++){
			int min=i;
			for (int j=i+1;j<n;j++){
				if (less(a[j],a[min])) min=j;
			}
			exch(a,i,min);
		}
	}
}
