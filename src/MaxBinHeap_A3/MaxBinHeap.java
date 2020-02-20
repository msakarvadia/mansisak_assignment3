package MaxBinHeap_A3;

import java.util.Arrays;

public class MaxBinHeap implements Heap_Interface {
	private double[] array; // load this array
	private int size;
	private static final int arraySize = 10000; // Everything in the array will initially
												// be null. This is ok! Just build out
												// from array[1]

	public MaxBinHeap() {
		this.array = new double[arraySize];
		array[0] = Double.NaN; // 0th will be unused for simplicity
								// of child/parent computations...
								// the book/animation page both do this.
	}

	// Please do not remove or modify this method! Used to test your entire Heap.
	@Override
	public double[] getHeap() {
		return this.array;
	}

	@Override
	public void insert(double element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMax() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getMax() {
		return this.array[1];
	}

	@Override
	public void clear() {
		Arrays.fill(this.array, Double.NaN);
		size = 0;

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void build(double[] elements) {
		// TODO Auto-generated method stub

	}

	@Override
	public double[] sort(double[] elements) {
		// TODO Auto-generated method stub
		return null;
	}

	// add your method implementstions
}