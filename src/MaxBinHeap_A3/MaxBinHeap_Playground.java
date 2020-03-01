package MaxBinHeap_A3;

public class MaxBinHeap_Playground {
	public static void main(String[] args) {
		// Add more tests as methods and call them here!!
		MaxBinHeap mbh = new MaxBinHeap();
		double[] collection = new double[] {3,5,7,1,9,34,-1,4};
		mbh.build(collection);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("Size of heap: "+mbh.size());
		System.out.println("Max of heap: "+ mbh.getMax());
		System.out.println("deleted max");
		mbh.delMax();
		printHeap(mbh.getHeap(), mbh.size());
		printSortCollection(new double[] {3,5,7,1,9,-1,4});
		double[] sorted = mbh.sort(new double[] {3,5,7,1,9,-1,4});
		printArray(sorted);
		mbh.build(new double[] {3,5,1,9,-1,4,7});
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("Size of heap: "+mbh.size());
		System.out.println("inserting 1300.0, -600.0, 5.0");
		mbh.insert(1300.0);
		mbh.insert(-600.0);
		mbh.insert(8.0);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("Size of heap: "+mbh.size());
		System.out.println("deleted max");
		mbh.delMax();
		printHeap(mbh.getHeap(), mbh.size());
		
		printSortCollection(new double[] {3,5,7,1,9,-1,4,-600.0,8});
		sorted = mbh.sort(new double[] {3,5,7,1,9,-1,4,-600.0,8});
		printArray(sorted);
		
		
		
		//TestBuild();
		//System.out.println();		
		//TestSort();
	}

	public static void TestBuild() {
		// constructs a new maxbinheap, constructs an array of double,
		// passes it into build function. Then print collection and heap.
		MaxBinHeap mbh = new MaxBinHeap();
		double[] collection = new double[] { 3, 8, 2, 1, 7, 4, 6, 5,9,0};
		mbh.build(collection);
		printHeapCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
	}

	public static void TestSort() {
		// constructs a new maxbinheap, constructs an array of double, passes
		// it into heapsort function. Then print collection and sorted array.

		MaxBinHeap mbh = new MaxBinHeap();
		double[] collection = new double[] { 3, 8, 2, 1, 7, 4, 6, 5,9,0};
		// TODO: undo this comment:
		double[] sorted = mbh.sort(collection);
		printSortCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
		printArray(sorted);
	}

	public static double[] charsToDoubles(char[] chars) {
		double[] ret = new double[chars.length];
		for (int i = 0; i < chars.length; i++) {
			ret[i] = charToInt(chars[i]);
		}
		return ret;
	}

	public static int charToInt(char c) {
		return c - 'a';
	}

	public static void printHeapCollection(double[] e) {
		// this will print the entirety of an array of doubles you will pass
		// to your build function.
		System.out.println("Printing Collection to pass in to build function:");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.print("\n");
	}

	public static void printHeap(double[] e, int len) {
		// pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th
		// index....
		System.out.println("Printing Heap");
		for (int i = 1; i < len + 1; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.print("\n");
	}

	public static void printSortCollection(double[] e) {
		// this will print the entirety of an array of doubles you will pass
		// to your build function.
		System.out.println("Printing Collection to pass in to heap sort function:");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.print("\n");
	}

	public static void printArray(double[] array) {
		System.out.println("Printing Array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.print("\n");
	}
}