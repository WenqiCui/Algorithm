
public class MyMergeSort extends MySort {
	private static Comparable[] t;
	public static void mSort(Comparable[] a,int l,int r){
		int mid=l+(r-l)/2;
		if (r<=l) return;
		mSort(a,l,mid);
		mSort(a,mid+1,r);
		for (int i=l;i<=r;i++){
			t[i]=a[i];
		}
		int ll=l;int rr=mid+1;
		for(int i=l;i<=r;i++){
			if (ll>mid) a[i]=t[rr++];
			else if (rr>r) a[i]=t[ll++];
			else if (less(t[ll],t[rr])) a[i]=t[ll++];
			else a[i]=t[rr++];
		}
	}
	public static void sort(Comparable[] a){
		t=new Comparable[a.length];
		mSort(a,0,a.length-1);
	}
}
