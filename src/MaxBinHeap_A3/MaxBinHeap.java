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
		this.array[size + 1] = element;
		size++;
		for (int i = size / 2; i > 0; i--) {
			max_heapify(this.array, i);
		}

	}

	@Override
	public void delMax() {
		if (size == 0) {
			return;
		}
		this.array[1] = this.array[size];
		this.size--;
		for (int i = size / 2; i > 0; i--) {
			max_heapify(this.array, i);
		}
	}

	@Override
	public double getMax() {
		if(this.size()==0) {
			return Double.NaN;
		}
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
		this.clear();
		this.size += elements.length;
		// System.out.println("size: "+size);
		// Put all elements in array in arbitrary order
		for (int i = 1; i < size + 1; i++) {
			if(elements[i-1] != Double.NaN) {
			this.array[i] = elements[i - 1];
			}
		}

		// Bubbled down for every element

		for (int i = size / 2; i > 0; i--) {
			max_heapify(this.array, i);
		}

	}

	public void max_heapify(double elements[], int i) {
		int left_child = i * 2;
		int right_child = i * 2 + 1;
		int largest;
		if (left_child <= this.size & elements[left_child] > elements[i]) {
			largest = left_child;
		} else {
			largest = i;
		}
		if (right_child <= this.size & elements[right_child] > elements[largest]) {
			largest = right_child;
		}
		if (largest != i) {
			double temp = elements[i];
			elements[i] = elements[largest];
			elements[largest] = temp;
			max_heapify(elements, largest);
		}
	}

	@Override
	public double[] sort(double[] elements) {
		this.build(elements);
		double[] sorted = new double[this.size()];
		for (int i = this.size() - 1; i >= 0; i--) {
			sorted[i] = this.getMax();
			this.delMax();
		}
		return sorted;
	}

}