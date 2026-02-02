// import java.util.ArrayList;

public class CustomGenArrayList<T> {

	private Object[] data;
	private static int DEFAULT_SIZE = 5;
	private int size = 0;

	public CustomGenArrayList() {
		this.data = new Object[DEFAULT_SIZE];
	}

	public void add(T value) {
		if (isFull()) {
			resize();
		}
		data[size++] = value;
	}

	private void resize() {
		Object[] temp = new Object[data.length * 2];

		//copy the current array into temp
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	private boolean isFull() {
		return size == data.length;
	}

	public T remove() {
		T removed = (T)(data[--size]);
		return removed;
	}

	public T get(int index) {
		return (T)(data[index]);
	}

	public int size() {
		return size;
	}

	public void set(int index, T value) {
		data[index] = value;
	}

	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}


	public static void main(String[] args) {
	//	ArrayList list = new ArrayList();

// 		CustomArrayList list = new CustomArrayList();
// 
// 		list.add(1);
// 		list.add(2);
// 		list.add(3);
// 		list.add(4);
// 		list.add(5);
// 
// 		list.remove();
// 		list.add(6);
// 		list.print();

		CustomGenArrayList<String> list2 = new CustomGenArrayList<>();

		list2.add("hello");
		list2.print();
	}
}
