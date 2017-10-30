
public class MyFinalMerge2 extends MySort {
	public static void sort(Comparable a[]){
		Comparable[] aux =new Comparable[a.length];
		for (int i=0;i<a.length;i++){
			aux[i]=a[i];
		}
		mSort(aux,a,0,a.length-1);
	}
	public static void mSort(Comparable[] a,Comparable[] aux,int lo,int hi){
		int mid=lo+(hi-lo)/2;
		if (lo>=hi) return;
		mSort(aux,a,lo,mid);
		mSort(aux,a,mid+1,hi);
		if (!less(a[mid+1],a[mid])){for (int i=lo;i<=hi;i++){aux[i]=a[i];}return;}
		merge(a,aux,lo,hi,mid);
	}
	
	public static void merge(Comparable[] a,Comparable[] aux,int lo,int hi,int mid){
		if (lo>=hi) return;
		int ll=lo;
		int rr=mid+1;
		for (int i=lo;i<=hi;i++){
			if (ll>mid) 					aux[i]=a[rr++];
			else if (rr>hi) 				aux[i]=a[ll++];
			else if (less(a[ll],a[rr])) 	aux[i]=a[ll++];
			else 							aux[i]=a[rr++];
		}
	}
}