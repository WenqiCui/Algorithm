
public class MyFinalMerge extends MySort {
	public static void sort(Comparable a[]){
		Comparable[] aux =new Comparable[a.length];
		for (int i=0;i<a.length;i++){
			aux[i]=a[i];
		}
		mSort(a,aux,0,a.length-1);
	}
	public static void mSort(Comparable[] a,Comparable[] aux,int lo,int hi){
		int mid=lo+(hi-lo)/2;
		if (lo>=hi) return;
		mSort(aux,a,lo,mid);
		mSort(aux,a,mid+1,hi);
		if (!less(a[mid+1],a[mid])){for (int i=lo;i<=hi;i++){a[i]=aux[i];}return;}
		merge(a,aux,lo,hi,mid);
	}
	public static void merge(Comparable[] a,Comparable[] aux,int lo,int hi,int mid){
		if (lo>=hi) return;
		int ll=lo;
		int rr=mid+1;
		for (int i=lo;i<=hi;i++){
			if (ll>mid) 					a[i]=aux[rr++];
			else if (rr>hi) 				a[i]=aux[ll++];
			else if (less(aux[ll],aux[rr])) a[i]=aux[ll++];
			else 							a[i]=aux[rr++];
		}
	}
}
