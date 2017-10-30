
public class MyThreeWayQuickSort extends MySort {
	public static void sort(Comparable[] a){
		MyQuickSort.shuffle(a);
		qsort(a,0,a.length-1);
	}
	public static void qsort(Comparable[] a,int l,int r){
		if (l>=r) return;
		int ll=l;int rr=r;
		Comparable f=a[ll];
		int i=ll;
		while (i<=rr){
			int com=a[i].compareTo(f);
			if (com<0) exch(a,ll++,i++);
			else if (com>0) exch(a,rr--,i);
			else i++;
		}
		qsort(a,l,ll-1);
		qsort(a,rr+1,r);
	}

}
