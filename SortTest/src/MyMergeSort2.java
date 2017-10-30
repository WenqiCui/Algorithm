
public class MyMergeSort2 extends MySort {
	private static Comparable[] t;
	public static  void merge(Comparable[] a,int l,int r,int mid){
		if (r<=l) return;
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
		int n=a.length;
		for (int i=1;i<n;i*=2){
			for (int j=0;j<n-i;j+=2*i){
				merge(a,j,Math.min(n-1, j+2*i-1),j+i-1);
			}
		}
	}
}
