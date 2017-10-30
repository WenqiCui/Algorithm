import java.util.Random;

public class MyQuickSort extends MySort {
	public static void sort(Comparable[] a){
		shuffle(a);
		qsort(a,0,a.length-1);
	}
	private static void qsort(Comparable[] a,int l,int r){
		if (l>=r) return;
		int ll=l;
		int rr=r+1;
		while (rr>ll){
			while (less(a[++ll],a[l])&&(ll<r));
			while (less(a[l],a[--rr])&&(rr>l));
			if (ll<rr) exch(a,ll,rr);
		}
		exch(a,l,rr);
		qsort(a,l,rr-1);
		qsort(a,rr+1,r);
	}

	public static void shuffle(Comparable[] a){
		int n=a.length;
		for (int i=0;i<n;i++){
			int r=(int)(Math.random()*(i+1));
			exch(a,i,r);
		}
	}
}
