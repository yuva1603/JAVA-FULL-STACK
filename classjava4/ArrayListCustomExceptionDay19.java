package classjava4;
class MyArrayList{
	private int size=0;
	private int capacity=5;
	private int[] arr=new int[capacity];
	
	public void add(int element) {
		if(size == capacity) {
			grow();
		}
		arr[size++]=element;
		}
	private void grow() {
		capacity = capacity+(capacity/2);
		int[] newArr=new int[capacity];
		for(int i=0;i<size;i++) {
			newArr[i]=arr[i];
		}
		arr=newArr;
	}
	public int get(int index) {
		if(index>=size) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	public int size() {
		return size;
	}
	}

public class ArrayListCustomExceptionDay19 {

	public static void main(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
