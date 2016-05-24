package com.softacad.homework;

public interface ISequence<T> {

	// * Insert a new item into the sequence.
	void push(T x);

	// * Get the most recently inserted item from the sequence.
	T pop();

	// *Get the element at a given index
	T get(int i);

	// * Test if the sequence is logically empty.
	boolean isEmpty();

	// * assert no empty
	void assertNoEmpty();

	// *return the size of the sequence
	int getSize();

	// *String representation of sequence
	String toString();
}
