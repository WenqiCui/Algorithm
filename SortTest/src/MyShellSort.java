
public class MyShellSort extends MySort {
	public static void sort(Comparable[] a){
		int n=a.length;
		int h=1;
		while (h<(n/3)) h=h*3+1;
		while (h>0) {
			for (int i=h;i<n;i++){
				for (int j=i;j>=h;j-=h){
					if (less(a[j],a[j-h])) exch(a,j,j-h);
				}
			}
			h/=3;
		}
	}

}
