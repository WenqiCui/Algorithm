
public abstract class MySort {
	public static boolean less(Comparable a,Comparable b){
		return a.compareTo(b)<0;
	}
	public static void exch(Comparable[] a,int i,int j){
		Comparable t=a[i];a[i]=a[j];a[j]=t;
	}
	public static void show(Comparable[] a){
		for  (Comparable i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static boolean isSorted(Comparable[] a){
		int n=a.length;
		for (int i=0;i<n-1;i++){
			if (less(a[i+1],a[i])) return false;
		}
		return true;
	}
	

}
