package com.softacad.homework;

public class DynamicArray {

	private int[] data;
	private int capacity;
	private int size;

	public DynamicArray(int max) {
		this.capacity = max;
		data = new int[capacity];
		size = 0;
	}

	public void set(int index, int element) {
		if (checkIndex(index)) {
			data[index] = element;
		} else {
			System.out.println("Index out of bounds");
		}
	}

	public int get(int index) {
		if (this.checkIndex(index)) {
			return data[index];
		}
		return 0;
	}

	public void add(int element) {
		checkCapacity();
		data[size] = element;
		size++;
	}

	public void checkCapacity() {
		if (size == capacity) {
			resize();
		}
	}

	public boolean checkIndex(int index) {
		return (index < capacity);
	}

	public void resize() {
		capacity++;
		int[] temp = new int[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public void insert(int index, int element) {
		checkCapacity();
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		size++;
	}

	public void delete(int index) {
		System.out.println(data[index] + " is deleted");
		for (int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		size--;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += data[i] + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		DynamicArray da = new DynamicArray(5);
		da.add(12);
		da.add(15);
		da.insert(2, 98);
		da.insert(3, 56);
		da.insert(4, 73);
		da.insert(5, 45);
		System.out.println(da);
		da.set(3, 33);
		System.out.println(da);
		System.out.println(da.get(3));
		da.delete(2);
		da.delete(4);
		System.out.println(da);
	}
}
