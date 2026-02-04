package com.pradeep.generics;

// import java.util.ArrayList;

public class CustomArrayList {

	private int[] data;
	private static int DEFAULT_SIZE = 5;
	private int size = 0;

	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}

	public void add(int num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}

	private void resize() {
		int[] temp = new int[data.length * 2];

		//copy the current array into temp
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	private boolean isFull() {
		return size == data.length;
	}

	public int remove() {
		int removed = data[--size];
		return removed;
	}

	public int get(int index) {
		return data[index];
	}

	public int size() {
		return size;
	}

	public void set(int index, int value) {
		data[index] = value;
	}

	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}


	public static void main(String[] args) {
	//	ArrayList list = new ArrayList();

		CustomArrayList list = new CustomArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.remove();
		list.add(6);
		list.print();

	}
}
