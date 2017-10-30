import java.util.ArrayList;

public class BinaryHeap<T extends Comparable<T>> {
	private ArrayList<T> heap;
	private int max=Integer.MAX_VALUE;
	private int n;
	public BinaryHeap() {
		heap=new ArrayList<T>();
		n=0;
		heap.add(0,null);
	}
	public BinaryHeap(int n){
		this();
		max=n;
	}	
	public void add(T a){
		heap.add(++n,a);
		swim(n);
	}
	public void add(T[] a){
		for (T i:a) add(i);
	}
	public T get(){return heap.get(1);}
	public T remove(){
		T ans=heap.get(1);
		exch(1,n);
		n--;
		sink(1);
		return ans;
	}
	public int size(){return n;}
	public boolean isEmpty(){return n==0?true:false;}

	private void swim(int a){
		while ((a>1)&&(heap.get(a).compareTo(heap.get(a/2))>0)){
			exch(a,a/2);
			a/=2;
		}
	}
	private void sink(int a){
		while (a*2<=n){
			int j=a*2;
			if (heap.get(j).compareTo(heap.get(j+1))<0) j++;
			if ((j<=n)&&(heap.get(j).compareTo(heap.get(a))>0)) {exch(a,j);a=j;}
			else break;
		}
	}
	private void exch(int a, int b) {
		// TODO 自动生成的方法存根
		T t=heap.get(b);
		heap.set(b, heap.get(a));
		heap.set(a, t);
	}

}
