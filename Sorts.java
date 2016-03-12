
public class Sorts {

	public static void main(String[] args) {

		int a[] = { 1, 5, 3, 6, 8, 2 };

		System.out.println("Before:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		bubbleSort(a);
		insertionSort(a);
		selectionSort(a);

		System.out.println("After:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void bubbleSort(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				// Swap [j] and [j + 1].
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}

		}
	}

	public static void insertionSort(int a[]) {
		// Runs number of swaps based on array length.
		for (int i = 0; i < a.length; i++) {
			int j = i;

			// Iterate through the array backwards.
			while (j > 0 && (a[j - 1] > a[j])) {
				// Swap [j] and [j - 1].
				int temp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = temp;
				j--;
			}
		}
	}

	public static void selectionSort(int a[]) {
		int j;

		for (int cur = 0; cur < a.length - 1; cur++) {
			// Assign lowest value as it is found.
			int lowest = cur;

			// Search array for lowest value.
			for (j = cur + 1; j < a.length; j++) {
				if (a[j] < a[lowest]) {
					lowest = j;
				}

			}
			//Swap the current value with the lowest value.
			int temp = a[cur];
			a[cur] = a[lowest];
			a[lowest] = temp;

		}
	}

}
